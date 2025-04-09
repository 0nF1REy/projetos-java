import java.util.Scanner;
import java.util.Locale;

public class Exer12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        int percentualIR = 0;

        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: (" + valorHora + " * " + qtdHoras + "):" + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%): " + ir);
        System.out.println("(-) INSS ( 10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário liquido: " + salarioLiquido);

        scan.close();
    }
}
