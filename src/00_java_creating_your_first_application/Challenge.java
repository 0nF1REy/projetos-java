import java.util.Locale;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in).useLocale(Locale.US);

        // VARIÁVEIS
        int option = 0;
        double balance = 1599.99;
        String name = "Clark Kent",
                accountType = "Checking",
                menu = """
                       ** Digite sua opção **
                       1 - Consultar saldo
                       2 - Transferir valor
                       3 - Receber valor
                       4 - Sair
                       """;

        System.out.println("********************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo de conta: " + accountType);
        System.out.println("Saldo atual: " + balance);
        System.out.println("\n********************");

        while (option != 4) {
            System.out.println(menu);
            option = inputScanner.nextInt();

            if (option == 1) {
                System.out.println("O saldo atualizado é: " + balance);
            } else if (option == 2) {
                System.out.println("Qual o valor que se deseja transferir?");
                double amount = inputScanner.nextDouble();
                if (amount > balance) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    balance -= amount;
                    System.out.println("Novo saldo: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: ");
                double amount = inputScanner.nextDouble();
                balance += amount;
                System.out.println("Novo saldo: " + balance);
            } else if (option != 4) {
                System.out.println("Opção inválida");
            }
        }

        inputScanner.close();
    }
}