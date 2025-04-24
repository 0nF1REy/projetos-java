import java.util.Scanner;
import java.util.Locale;

public class Exer08 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int num;
        int soma = 0;
        double media;

        for (int i=0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = scan.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}