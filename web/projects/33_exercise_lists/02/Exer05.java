import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota01 = scan.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        double nota02 = scan.nextDouble();

        double media = (nota01 + nota02) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scan.close();
    }
}
