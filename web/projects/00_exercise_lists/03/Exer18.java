import java.util.Scanner;

public class Exer18 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        if (num <= 1) {
            System.out.println("Não é primo - números menores ou iguais a 1 não são primos.");
            return;
        }

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("É número primo");
        }

    }
}
