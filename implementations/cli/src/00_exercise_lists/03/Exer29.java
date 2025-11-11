import java.util.Scanner;
import java.util.Locale;

public class Exer29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        boolean primo;

        for (int i = 2; i <= num; i++) {

            primo = true;

//            for (int j = 2; j < i; j++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }
    }
}
