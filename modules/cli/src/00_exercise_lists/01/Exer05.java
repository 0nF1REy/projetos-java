import java.util.Scanner;
import java.util.Locale;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Entre com a quantidade de metros: ");
        double metros = scan.nextDouble();

        // 1 m = 100 cm
        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cm");

        scan.close();
    }
}
