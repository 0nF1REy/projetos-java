import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in).useLocale(Locale.US);

        double averageRating = 0,
                score = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme ");
            score = reading.nextDouble();
            averageRating += score;
        }

        System.out.println("Média de avaliações: " + averageRating / 3);
    }
}