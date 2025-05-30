import java.util.Scanner;

public class Exer29 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // Pares
        int[] vetorC = new int[vetorA.length]; // Ímpares

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posição A: " + i);
            vetorA[i] = scan.nextInt();
        }

        // byte ou int
        byte posB = 0;
        byte posC = 0;

        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i=0; i<posC; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

        scan.close();
    }
}