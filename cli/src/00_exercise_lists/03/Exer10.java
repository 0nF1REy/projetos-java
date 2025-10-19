import java.util.Scanner;

public class Exer10 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int num01 = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num02 = scan.nextInt();

        for (int i = num01; i <= num02; i++) {
            System.out.println(i);
        }
    }
}