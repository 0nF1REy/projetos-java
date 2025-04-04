import java.util.Scanner;
import java.util.Locale;

public class KeyboardDataReading {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("\n=========================");
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println("=========================\n");

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        System.out.println("=========================\n");

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine(); // Limpar o buffer após o nextInt()
        System.out.println("Sua idade é: " + idade);
        System.out.println("===================\n");

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        scan.nextLine(); // Limpar o buffer após o nextDouble()
        System.out.println("A sua altura é: " + altura);
        System.out.println("====================\n");

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
        String primeiroNomeBacana = scan.next();
        int idadeBacana = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float alturaBacana = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("=================================\n");

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("Primeiro nome: " + primeiroNomeBacana);
        System.out.println("Idade: " + idadeBacana);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + alturaBacana);
        System.out.println("Tem bichinho de estimação? " + temPet);
        System.out.println("=================================\n");

        scan.close();
    }
}
