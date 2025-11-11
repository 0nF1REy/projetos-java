import java.util.Scanner;

public class Bully {

    static boolean[] estado = new boolean[5]; // estado dos processos (true = ativo)
    static int coordenador = 5; // começa com o processo 5 como coordenador

    // Ativa um processo e inicia eleição se necessário
    public static void subir(int processo) {
        if (estado[processo - 1]) {
            System.out.println("O processo " + processo + " já está ativo.");
            return;
        }

        estado[processo - 1] = true;
        System.out.println("O processo " + processo + " foi ativado e iniciou uma eleição.");

        boolean encontrouAtivoSuperior = false;

        for (int i = processo + 1; i <= 5; i++) {
            System.out.println("Mensagem de eleição enviada do processo " + processo + " para o processo " + i);
            if (estado[i - 1]) {
                System.out.println("Resposta de vida recebida do processo " + i);
                encontrouAtivoSuperior = true;
                break;
            }
        }

        // Se não encontrou nenhum processo ativo de ID maior, torna-se coordenador
        if (!encontrouAtivoSuperior) {
            coordenador = processo;
            System.out.println("Nenhum processo superior ativo. O processo " + processo + " é o novo coordenador.");
        }
    }

    // Desativa um processo
    public static void descer(int processo) {
        if (!estado[processo - 1]) {
            System.out.println("O processo " + processo + " já está inativo.");
        } else {
            estado[processo - 1] = false;
            System.out.println("O processo " + processo + " foi desativado.");

            // Se o coordenador caiu, o sistema precisa de nova eleição
            if (processo == coordenador) {
                System.out.println("O coordenador atual (P" + processo + ") caiu! Será necessária nova eleição.");
            }
        }
    }

    // Envio de mensagem: verifica se o coordenador está ativo
    public static void mensagem(int processo) {
        if (!estado[processo - 1]) {
            System.out.println("O processo " + processo + " está inativo e não pode enviar mensagens.");
            return;
        }

        if (estado[coordenador - 1]) {
            System.out.println("O processo " + processo + " enviou mensagem ao coordenador P" + coordenador + ".");
            System.out.println("Resposta do coordenador: OK");
        } else {
            System.out.println("O coordenador atual (P" + coordenador + ") não respondeu.");
            System.out.println("O processo " + processo + " iniciou uma nova eleição.");

            int novoCoordenador = -1;

            // Eleição: o maior processo ativo vence
            for (int i = 5; i >= 1; i--) {
                if (estado[i - 1]) {
                    novoCoordenador = i;
                    break;
                }
            }

            if (novoCoordenador != -1) {
                coordenador = novoCoordenador;
                System.out.println("Novo coordenador eleito: P" + coordenador);
            } else {
                System.out.println("Nenhum processo ativo disponível para ser coordenador!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Inicializa todos os processos como ativos
        for (int i = 0; i < 5; i++) {
            estado[i] = true;
        }

        System.out.println("5 processos ativos: P1 P2 P3 P4 P5");
        System.out.println("O processo 5 é o coordenador inicial.");

        do {
            System.out.println("\n--------- MENU ---------");
            System.out.println("1. Ativar um processo");
            System.out.println("2. Desativar um processo");
            System.out.println("3. Enviar uma mensagem");
            System.out.println("4. Exibir coordenador atual");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Ativar processo: ");
                    int subir = sc.nextInt();
                    if (subir >= 1 && subir <= 5) {
                        subir(subir);
                    } else {
                        System.out.println("Processo inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Desativar processo: ");
                    int descer = sc.nextInt();
                    if (descer >= 1 && descer <= 5) {
                        descer(descer);
                    } else {
                        System.out.println("Processo inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Qual processo enviará a mensagem? ");
                    int msg = sc.nextInt();
                    if (msg >= 1 && msg <= 5) {
                        mensagem(msg);
                    } else {
                        System.out.println("Processo inválido.");
                    }
                    break;

                case 4:
                    System.out.println("O coordenador atual é o processo P" + coordenador + ".");
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        sc.close();
    }
}
