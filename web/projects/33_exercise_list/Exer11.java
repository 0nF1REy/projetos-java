import java.util.Scanner;
import java.util.Locale;

public class Exer11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Forneça um número inteiro:");
        int num1 = scan.nextInt();

        System.out.println("Forneça outro número inteiro:");
        int num2 = scan.nextInt();

        System.out.println("Forneça um número real:");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow (num3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);

        scan.close();
    }
}
