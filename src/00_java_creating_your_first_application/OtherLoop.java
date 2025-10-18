import java.util.Locale;
import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in).useLocale(Locale.US);

        int ratingCount = 0;
        double sumRatings = 0,
                rating = 0;

        while (rating != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar");
            rating = inputScanner.nextDouble();

            if (rating != -1) {
                sumRatings += rating;
                ratingCount++;
            }
        }

        if (ratingCount > 0) {
            double averageRating = sumRatings / ratingCount;
            System.out.println("Obrigado por avaliar! A média das suas avaliações foi: " + String.format("%.2f", averageRating));
        } else {
            System.out.println("Você não avaliou nenhum filme. Nenhuma média foi calculada.");
        }

        inputScanner.close();
    }
}
