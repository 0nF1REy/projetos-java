import java.util.Scanner;
import java.util.Locale;

public class Exer12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Forneça a altura em metros:");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);

        scan.close();
    }
}
