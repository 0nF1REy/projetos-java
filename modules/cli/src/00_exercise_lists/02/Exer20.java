import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Telefonou para a vítima? ");
        String resp01 = scan.next();

        System.out.print("Esteve no local do crime? ");
        String resp02 = scan.next();

        System.out.print("Mora perto da vítima? ");
        String resp03 = scan.next();

        System.out.print("Já trabalhou com a vítima? ");
        String resp04 = scan.next();

        System.out.print("Devia para a vítima? ");
        String resp05 = scan.next();

        int cont = 0;

        if (resp01.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp02.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp03.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp04.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp05.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita!");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice!");
        } else if (cont == 5) {
            System.out.println("Assassino!");
        } else if (cont == 0) {
            System.out.println("Inocente!");
        }

        scan.close();
    }
}
