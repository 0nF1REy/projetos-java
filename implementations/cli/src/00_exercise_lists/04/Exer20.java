import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Exer20 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        DecimalFormat df = new DecimalFormat("0.00");

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("\nEntre com a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        System.out.println("\nVetor A (valores convertidos em R$):");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i + 1) + " dólar(es) = R$ " + df.format(vetorA[i]));
        }
    }
}
