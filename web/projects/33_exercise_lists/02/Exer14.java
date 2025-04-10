import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota01 = scan.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        double nota02 = scan.nextDouble();

        double media = (nota01 + nota02) / 2;

        String aproveitamento = "";
        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        } else {
            aproveitamento = "E";
        }

        System.out.println("Primeira nota: " + nota01);
        System.out.println("Segunda nota: " + nota02);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);

        switch (aproveitamento) {
            case "A":
            case "B":
            case "C": System.out.println("Aprovado!"); break;
            case "D":
            case "E": System.out.println("Reprovado!"); break;

        }

        scan.close();
    }
}
