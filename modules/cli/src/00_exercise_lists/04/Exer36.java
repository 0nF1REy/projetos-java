import java.util.Scanner;

public class Exer36 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição A: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 0) {
                System.out.println("Valor negativo! O fatorial será considerado como 0.");
                vetorA[i] = 0;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            int fatorial = 1;

            for (int j = 1; j <= vetorA[i]; j++) {
                fatorial *= j;
            }

            vetorB[i] = fatorial;
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        scan.close();
    }
}
