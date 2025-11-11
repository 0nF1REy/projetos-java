import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        int[] diasPorMes = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        byte opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção: ");
            opcao = scan.nextByte();

            if (opcao == 1 || opcao == 2) {

                int mes;
                do {
                    System.out.print("Digite o mês (1-12): ");
                    mes = scan.nextInt();
                } while (mes < 1 || mes > 12);

                int dia;
                do {
                    System.out.print("Digite o dia (1-" + diasPorMes[mes - 1] + "): ");
                    dia = scan.nextInt();
                } while (dia < 1 || dia > diasPorMes[mes - 1]);

                int hora;
                do {
                    System.out.print("Digite a hora (0-7): ");
                    hora = scan.nextInt();
                } while (hora < 0 || hora > 7);

                scan.nextLine();

                if (opcao == 1) {
                    System.out.print("Digite o compromisso: ");
                    compromissos[mes - 1][dia - 1][hora] = scan.nextLine();
                    System.out.println("Compromisso adicionado com sucesso.");
                } else {
                    String compromisso = compromissos[mes - 1][dia - 1][hora];
                    if (compromisso != null) {
                        System.out.println("Compromisso agendado: " + compromisso);
                    } else {
                        System.out.println("Nenhum compromisso agendado neste horário.");
                    }
                }

            } else if (opcao == 0) {
                sair = true;
                System.out.println("Encerrando o programa.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scan.close();
    }
}
