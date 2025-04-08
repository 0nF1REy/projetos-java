import java.util.Scanner;
import java.util.Locale;

public class Exer09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Forneça a temperatura em Farenheit:");
        double f = scan.nextDouble();

        double c = (5 * (f-32) / 9);

        System.out.println("A temperatura " + f + " F é igual a " + c + " C");

        scan.close();
    }
}
