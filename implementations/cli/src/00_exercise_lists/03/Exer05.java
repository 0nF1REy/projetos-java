import java.util.Scanner;
import java.util.Locale;

public class Exer05 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        boolean valido = false;
        double popA, popB, taxaA, taxaB;

        do {
            System.out.print("Entre com a população A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior do que 0.");
            }
        } while (!valido);

        valido = false;

        do {
            System.out.print("Entre com a população B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior do que 0.");
            }
        } while (!valido);

        valido = false;

        do {
            System.out.print("Entre com a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento A precisa ser maior do que 0.");
            }
        } while (!valido);

        valido = false;

        do {
            System.out.print("Entre com a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento B precisa ser maior do que 0.");
            }
        } while (!valido);

        int cont = 0;

        while (popA < popB) {
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtde anos: " + cont);
    }
}