import java.util.Scanner;

public class Exer30 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número para ser gerado a sua tabuada: ");
        int num = scan.nextInt();

        boolean invalido = true;
        int numInicial,numFinal;

        do {
            System.out.print("Entre com o início da tabuada: ");
            numInicial = scan.nextInt();

            System.out.print("Entre com o final da tabuada: ");
            numFinal = scan.nextInt();

            if (numFinal > numInicial) {
                invalido = false;
            }
        } while (invalido);


        System.out.println("Tabuada do " + num + ":");
        System.out.println("Começar por:" + numInicial);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();

        for (int i = numInicial; i <= numFinal; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}