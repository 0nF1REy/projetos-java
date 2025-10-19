package br.com.alanryan.screen_match.app;

import br.com.alanryan.screen_match.models.Movie;
import br.com.alanryan.screen_match.models.Serie;
import br.com.alanryan.screen_match.utils.Utils;

public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setTitle("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        Utils.print("Duração do filme: " + myMovie.getDurationInMinutes());
        myMovie.showTechnicalSheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        Utils.print("Total de avaliações: " + myMovie.getTotalRatings());
        Utils.print(myMovie.getRating());

        Serie lost = new Serie();
        lost.setTitle("Lost");
        lost.setReleaseYear(2000);
        lost.showTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        Utils.print("Duração para maratonar Lost: " + lost.getDurationInMinutes());
    }
}