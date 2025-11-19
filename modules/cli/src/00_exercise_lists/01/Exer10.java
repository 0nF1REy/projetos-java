import java.util.Scanner;
import java.util.Locale;

public class Exer10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Forneça a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura " + c + " C é igual a " + f + " F");

        scan.close();
    }
}
