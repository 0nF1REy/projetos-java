import java.util.Scanner;
import java.util.Locale;

public class Exer08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Entre com o primeiro preço: ");
        double preco01 = scan.nextDouble();

        System.out.print("Entre com o segundo preço: ");
        double preco02 = scan.nextDouble();

        System.out.print("Entre com o terceiro preço: ");
        double preco03 = scan.nextDouble();

        if (preco01 <= preco02 && preco01 <= preco03) {
            System.out.println("Compre o produto 01!");
        } else if (preco02 <= preco01 && preco02 <= preco03) {
            System.out.println("Compre o produto 02!");
        } else {
            System.out.println("Compre o produto 03!");
        }

            scan.close();
    }
}
