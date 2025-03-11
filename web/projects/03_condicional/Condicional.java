import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        // ===========
        //  Criar Scanner
        // ===========
        Scanner scanner = new Scanner(System.in);

        // ===========
        //  Solicitar Idade
        // ===========
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // ------------
        System.out.println("=======================");

        // =============
        //  Condicional
        // ============
        if (idade >= 18) {
            System.out.println("Pode entrar, bom filme!");
        } else {
            System.out.println("Esse filme é apenas para maiores, criança!");
        }
        System.out.println("=======================");

        // Fechar scanner
        scanner.close();
    }
}
