import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimuladorAnel {

    public static void main(String[] args) throws InterruptedException {
        final int NUM_PROCESSOS = 5;
        List<ProcessoAnel> processos = new ArrayList<>();

        // Cria os processos com IDs não sequenciais para um teste mais realista
        int[] ids = {10, 8, 20, 5, 15};
        for (int id : ids) {
            processos.add(new ProcessoAnel(id));
        }

        // Conecta os processos em um anel
        System.out.println("Anel de processos criado na seguinte ordem:");
        for (int i = 0; i < NUM_PROCESSOS; i++) {
            ProcessoAnel atual = processos.get(i);
            ProcessoAnel sucessor = processos.get((i + 1) % NUM_PROCESSOS); // O próximo, ou o primeiro se for o último
            atual.setSucessor(sucessor);
            System.out.print("P" + atual.getProcessoId() + " -> ");
        }
        System.out.println("P" + processos.get(0).getProcessoId() + " (volta ao início)");

        // Inicia as threads
        for (ProcessoAnel p : processos) {
            p.start();
        }
        
        System.out.println("\nPara iniciar, vamos começar uma eleição a partir de um processo.");
        // Inicia a primeira eleição a partir do primeiro processo da lista
        processos.get(0).iniciarEleicao();

        // Interface de usuário
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--------- MENU DE SIMULAÇÃO (ANEL) ---------");
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
                    processos.stream().filter(p -> p.getProcessoId() == pid).findFirst().ifPresent(ProcessoAnel::desativar);
                    break;
                case 2:
                    System.out.print("ID do processo a ativar: ");
                    pid = Integer.parseInt(sc.nextLine());
                    processos.stream().filter(p -> p.getProcessoId() == pid).findFirst().ifPresent(ProcessoAnel::ativar);
                    break;
                case 3:
                     System.out.print("ID do processo para iniciar a eleição: ");
                     pid = Integer.parseInt(sc.nextLine());
                     processos.stream().filter(p -> p.getProcessoId() == pid).findFirst().ifPresent(ProcessoAnel::iniciarEleicao);
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