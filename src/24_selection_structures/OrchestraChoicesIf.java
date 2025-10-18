import java.util.Scanner;

public class OrchestraChoicesIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Bem-vindo à Orquestra das Escolhas!");
        System.out.println("1 - Tocar um solo de Violino");
        System.out.println("2 - Tocar um solo de Flauta");
        System.out.println("3 - Tocar um solo de Trompete");
        System.out.println("4 - Tocar um solo de Bateria");
        System.out.println("-----------------------------------");
        System.out.print("Escolha seu instrumento (1, 2, 3 ou 4): ");

        // Verificar se a entrada é um número inteiro válido
        if (scanner.hasNextInt()) {
            System.out.println("-----------------------------------");
            int escolha = scanner.nextInt();

            // ==============================
            // Estrutura de seleção (if-else)
            // ==============================
            if (escolha == 1) {
                System.out.println("Você escolheu o Violino! Que belo som!");
            } else if (escolha == 2) {
                System.out.println("Você escolheu a Flauta! Melodias suaves!");
            } else if (escolha == 3) {
                System.out.println("Você escolheu o Trompete! Sons poderosos!");
            } else if (escolha == 4) {
                System.out.println("Você escolheu a Bateria! Ritmo contagiante!");
            } else {
                System.out.println("Instrumento inválido! Esse não faz parte da orquestra.");
            }
        } else {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
            scanner.nextLine(); // Limpar a entrada
        }

        scanner.close();
        System.out.println("===================================");
    }
}

class PianoChoicesSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Bem-vindo ao Piano das Escolhas!");
        System.out.println("1 - Tocar Dó");
        System.out.println("2 - Tocar Ré");
        System.out.println("3 - Tocar Mi");
        System.out.println("4 - Tocar Fá");
        System.out.println("-----------------------------------");
        System.out.print("Escolha a nota (1, 2, 3 ou 4): ");

        if (scanner.hasNextInt()) {
            System.out.println("-----------------------------------");
            int escolha = scanner.nextInt();

            // =============================
            // Estrutura de seleção (switch)
            // =============================
            switch (escolha) {
                case 1:
                    System.out.println("Você tocou Dó!");
                    break;
                case 2:
                    System.out.println("Você tocou Ré!");
                    break;
                case 3:
                    System.out.println("Você tocou Mi!");
                    break;
                case 4:
                    System.out.println("Você tocou Fá!");
                    break;
                default:
                    System.out.println("Tecla inválida! Essa nota não está no piano.");
                    break;
            }
        } else {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("===================================");
    }

}
