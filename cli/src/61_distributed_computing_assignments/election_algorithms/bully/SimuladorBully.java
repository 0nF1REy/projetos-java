import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SimuladorBully {

    public static void main(String[] args) throws InterruptedException {
        final int NUM_PROCESSOS = 5;
        List<Processo> processos = new ArrayList<>();

        // Cria os processos. A lista precisa ser passada no construtor
        // para que cada processo conheça os outros.
        for (int i = 1; i <= NUM_PROCESSOS; i++) {
            processos.add(new Processo(i, processos));
        }
        
        // Inicia as threads dos processos
        for (Processo p : processos) {
            p.start();
        }

        System.out.println(NUM_PROCESSOS + " processos foram criados e iniciados.");
        Thread.sleep(1000); // Pequena pausa para as threads estabilizarem

        // O processo de maior ID inicia a primeira eleição para definir o coordenador inicial
        processos.stream()
            .max(Comparator.comparing(Processo::getProcessoId))
            .ifPresent(Processo::iniciarEleicao);
        
        // Interface de usuário para interagir com a simulação
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--------- MENU DE SIMULAÇÃO ---------");
            System.out.println("1. Desativar (falhar) um processo");
            System.out.println("2. Ativar (recuperar) um processo");
            System.out.println("3. Iniciar eleição a partir de um processo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida.");
                continue;
            }

            int pid;
            switch (opcao) {
                case 1:
                    System.out.print("ID do processo a desativar: ");
                    pid = Integer.parseInt(sc.nextLine());
                    processos.get(pid - 1).desativar();
                    break;
                case 2:
                    System.out.print("ID do processo a ativar: ");
                    pid = Integer.parseInt(sc.nextLine());
                    processos.get(pid - 1).ativar();
                    break;
                case 3:
                     System.out.print("ID do processo para iniciar a eleição: ");
                     pid = Integer.parseInt(sc.nextLine());
                     Processo p = processos.get(pid-1);
                     if(p.isAtivo()){
                         p.iniciarEleicao();
                     } else {
                         System.out.println("Processo " + pid + " está inativo e não pode iniciar uma eleição.");
                     }
                    break;
                case 4:
                    System.out.println("Encerrando simulação...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
             Thread.sleep(500); // Pausa para ver o resultado da ação
        }
    }
}