import java.util.Scanner;
import java.util.Locale;

public class Exer03 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        boolean infoValida = false;
        String nome, genero, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Entre com o nome: ");

            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.print("Entre com a idade: ");

            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.print("Entre com o salário: ");

            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.print("Entre com o gênero: ");

            genero = scan.next();

            if (genero.equalsIgnoreCase("f") ||
            genero.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.print("Entre com o estado civil: ");

            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
            estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("O estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);

        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}