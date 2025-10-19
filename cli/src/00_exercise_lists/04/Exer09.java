import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer09 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorB.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i=0; i<vetorB.length; i++) {
            System.out.println("Entre com o valor do vetor B da posição: " + i);
            vetorB[i] = scan.nextInt();
        }

        for (int i=0; i<vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (int i=0; i<vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}