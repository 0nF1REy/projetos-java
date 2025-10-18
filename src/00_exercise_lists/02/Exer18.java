import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Forneça um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        scan.close();
    }
}
