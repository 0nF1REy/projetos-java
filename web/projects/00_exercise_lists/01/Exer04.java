import java.util.Scanner;
import java.util.Locale;

public class Exer04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Entre com a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Entre com a quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);

        scan.close();
    }
}
