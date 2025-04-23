import java.util.Scanner;
import java.util.Locale;

public class Exer01 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        boolean notaValida = false;

        do {

        System.out.print("Entre com uma nota: ");

        double nota = scan.nextDouble();


            if (nota >=0 && nota <=10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
//                notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }
        } while (!notaValida);
    }
}