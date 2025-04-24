import java.util.Scanner;

public class Exer14 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = 0,pares = 0, impares = 0;

        for (int i=0; i < 10; i++) {
            System.out.print("Entre com um número: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}