import java.util.Scanner;
import java.util.Locale;

public class Exer06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Entre com o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow (raio, 2);

        System.out.println("A área do círculo é: " + area);

        scan.close();
    }
}
