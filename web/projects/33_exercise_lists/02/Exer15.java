import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro lado: ");
        int lado01 = scan.nextInt();

        System.out.print("Entre com o segundo lado: ");
        int lado02 = scan.nextInt();

        System.out.print("Entre com o terceiro lado: ");
        int lado03 = scan.nextInt();

        if (((lado01 + lado02) > lado03) ||
            ((lado01 + lado03) > lado02) ||
                    ((lado02 + lado03) > lado01)) {

            if ( lado01 == lado02 && lado01 == lado03 && lado02 == lado03 ) {
                System.out.println("Triângulo Equilátero");
            } else if ( lado01 != lado02 && lado01 != lado03 && lado03 != lado02 ) {
                System.out.println("Triângulo Escaleno");
            } else if ( lado01 == lado02 || lado01 == lado03 || lado02 == lado03 ) {
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("Não forma um triângulo");
        }

        scan.close();
    }
}
