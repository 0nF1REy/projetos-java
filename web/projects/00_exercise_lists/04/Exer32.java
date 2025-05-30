import java.util.Scanner;

public class Exer32 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posição A: " + i);
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        String msg;
        boolean primo = true;

        for (int i=0; i<vetorA.length; i++) {

            primo = true;
            for (int j = 2; j<vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";
            if (primo) {
                msg = " primo";
            } else {
                msg = " Não é primo";
            }

            System.out.println(vetorA[i] + msg);
        }

        scan.close();
    }
}