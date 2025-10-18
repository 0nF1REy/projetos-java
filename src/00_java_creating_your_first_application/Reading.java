import java.util.Locale;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu filme favorito");
        String movie = reading.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int yearOfRelease = reading.nextInt();
        System.out.println("Diga a sua avaliação para o filme ");
        double rating = reading.nextDouble();

        System.out.println(movie);
        System.out.println(yearOfRelease);
        System.out.println(rating);

        reading.close();
    }
}