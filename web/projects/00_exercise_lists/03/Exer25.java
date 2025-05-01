import java.util.Scanner;
import java.util.Locale;

public class Exer25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        boolean sair = false;
        String continuarCompra, output;
        int qtdProdutos;
        double preco, total, valorPago, troco;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "Lojas Tabajara\n";

                System.out.print("Digite a quantidade de produtos da compra: ");
                qtdProdutos = scan.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.print("Informe o preço do produto " + i + ": ");
                    preco = scan.nextDouble();

                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }

                output += "Total: R$ " + total + "\n";

                System.out.print("Entre com o valor pago: ");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                if (valorPago < total) {
                    output += "Valor insuficiente! Faltam R$ " + (total - valorPago) + "\n";
                } else {
                    troco = valorPago - total;
                    output += "Troco: R$ " + troco + "\n";
                }

                System.out.println(output);

            } else {
                sair = true;
            }

        } while (!sair);

        scan.close();
    }
}
