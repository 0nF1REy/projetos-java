import java.util.Scanner;
import java.util.Locale;

public class Exer19 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Entre com o número de notas: ");
        double notas = scan.nextDouble();

        double soma = 0;
        double media,nota;

        for (int i=0; i<notas; i++) {
            System.out.println("Entre com a nota " + (i+1));
            nota = scan.nextDouble();

            soma += nota;
        }

        media = soma / notas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}