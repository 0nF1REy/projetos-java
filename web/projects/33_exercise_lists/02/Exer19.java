import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Forneça o primeiro número: ");
        int num01 = scan.nextInt();

        System.out.print("Forneça o segundo número: ");
        int num02 = scan.nextInt();

        System.out.print("Entre com a operação (+ - / *): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+": resultado = num01 + num02; break;
            case "-": resultado = num01 - num02; break;
            case "*": resultado = num01 * num02; break;
            case "/": resultado = num01 / num02; break;
            default:
                System.out.println("Operação inválida!");
                valida = false;
        }

        System.out.println("Resultado: " + resultado);

        if (valida) {

            if (resultado >= 0) {
                System.out.println("Resultado: positivo!");
            } else {
                System.out.println("Resultado: negativo!");
            }

            if (resultado % 2 == 0) {
                System.out.println("Resultado: par!");
            } else {
                System.out.println("Resultado: ímpar!");
            }
        }

        scan.close();
    }
}
