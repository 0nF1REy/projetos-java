public class Music {

    // ATRIBUTOS
    private String title;
    private String artist;
    private int releaseYear;
    private double rating;
    private int numberOfRatings;
    private double sumRatings;

    // CONSTRUTOR
    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.rating = 0;
        this.numberOfRatings = 0;
        this.sumRatings = 0;
    }

    // Método para exibir a ficha técnica
    void showTechnicalSheet() {
        System.out.println("Título: " + title);
        System.out.println("Artista: " + artist);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Avaliação média: " + rating);
        System.out.println("Número de avaliações: " + numberOfRatings);
        System.out.println();
    }

    // Método para avaliar
    void rate(double score) {
        sumRatings += score;
        numberOfRatings++;
        rating = sumRatings / numberOfRatings;
    }
}
