import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int num01 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num02 = scan.nextInt();

        if (num01 > num02) {
            System.out.println("O primeiro número é maior: " + num01);
        } else {
            System.out.println("O segundo número é maior: " + num02);
        }

        scan.close();
    }
}
