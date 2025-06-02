import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de pessoas que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i=0; i<nomesFilhos.length; i++) {

            System.out.print("Informe a quantidade de filhos(as): ");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j=0; j<nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do(a) filho(a) " + (j + 1) + ":");
                nomesFilhos[i][j] = scan.next();
            }
        }

        System.out.println("\n----- Resultado da Entrevista -----\n");

        for (int i=0; i<nomesFilhos.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filho(a)(s)");
            for(int j=0; j<nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}