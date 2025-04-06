import java.util.Scanner;
import java.util.Locale;

public class Exer14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Forneça o tamanho do arquivo:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Forneça a velocidade da internet:");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: " + tempo);

        scan.close();
    }
}
