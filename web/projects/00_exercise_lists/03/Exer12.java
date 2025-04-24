import java.util.Scanner;

public class Exer12 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número para ser gerado a sua tabuada: ");
        int num = scan.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}