import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        byte opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            opcao = scan.nextByte();

            if (opcao == 1) {

                int dia = 0;

                do {
                    System.out.println("Entre com o dia do mês (1-31):");
                    dia = scan.nextInt();
                } while (dia < 1 || dia > 31);

                int hora = 0;

                do {
                    System.out.println("Entre com a hora (0-23):");
                    hora = scan.nextInt();
                } while (hora < 0 || hora > 23);

                scan.nextLine();
                System.out.println("Digite o compromisso:");
                compromissos[dia - 1][hora] = scan.nextLine();

            } else if (opcao == 2) {

                int dia = 0;

                do {
                    System.out.println("Entre com o dia do mês (1-31):");
                    dia = scan.nextInt();
                } while (dia < 1 || dia > 31);

                int hora = 0;

                do {
                    System.out.println("Entre com a hora (0-23):");
                    hora = scan.nextInt();
                } while (hora < 0 || hora > 23);

                String compromisso = compromissos[dia - 1][hora];
                if (compromisso != null) {
                    System.out.println("Compromisso agendado: " + compromisso);
                } else {
                    System.out.println("Nenhum compromisso agendado nesse horário.");
                }

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente.");
            }
        }

        scan.close();
    }
}
