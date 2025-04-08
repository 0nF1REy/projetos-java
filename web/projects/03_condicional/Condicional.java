import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ifElse(scanner);
        switchCase(scanner);

        scanner.close();
    }

    // ======================
    //  Exemplo usando if/else
    // ======================
    public static void ifElse(Scanner scanner) {
        System.out.print("\nDigite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("-- -- -- --");

        if (idade >= 18) {
            System.out.println("Pode entrar, bom filme!");
        } else {
            System.out.println("Esse filme é apenas para maiores, criança!");
        }

        System.out.println("=======================");
    }

    // ==========================
    // Exemplo usando switch/case
    // ==========================
    public static void switchCase(Scanner scanner) {
        System.out.print("\nDigite um número de 1 a 7 para o dia da semana: ");
        int diaSemana = scanner.nextInt();

        System.out.println("-- -- -- --");

        switch (diaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia da semana válido");
        }

        System.out.println("=======================");
    }
}
