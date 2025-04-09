import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int num01 = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num02 = scan.nextInt();

        System.out.print("Entre com o terceiro número: ");
        int num03 = scan.nextInt();

        if (num01 >= num02 && num01 >= num03) {
            System.out.println("O primeiro número é maior: " + num01);
        } else if (num02 >= num01 && num02 >= num03) {
            System.out.println("O segundo número é maior: " + num02);
        } else {
            System.out.println("O terceiro número é maior: " + num03);
        }

        scan.close();
    }
}
