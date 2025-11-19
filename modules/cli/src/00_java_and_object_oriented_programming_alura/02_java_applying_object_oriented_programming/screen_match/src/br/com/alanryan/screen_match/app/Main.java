package br.com.alanryan.screen_match.app;

import br.com.alanryan.screen_match.calculations.RecommendationFilter;
import br.com.alanryan.screen_match.calculations.TimeCalculator;
import br.com.alanryan.screen_match.models.Episode;
import br.com.alanryan.screen_match.models.Movie;
import br.com.alanryan.screen_match.models.Serie;
import br.com.alanryan.screen_match.utils.Utils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie("O poderoso chefão", 1970);
//        myMovie.setTitle("O poderoso chefão");
//        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        Utils.print("Duração do filme: " + myMovie.getDurationInMinutes());
        myMovie.showTechnicalSheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        Utils.print("Total de avaliações: " + myMovie.getTotalRatings());
        Utils.print(myMovie.getRating());

        Serie lost = new Serie("Lost", 2000);
        lost.showTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        Utils.print("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(otherMovie);
        calculator.includes(lost);
        Utils.print(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.filter(episode);

        var alanMovie = new Movie("Dogville", 2003);
        alanMovie.setDurationInMinutes(200);
        alanMovie.rate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(alanMovie);
        movieList.add(myMovie);
        movieList.add(otherMovie);
        Utils.print("Tamanho da lista: " + movieList.size());
        Utils.print("Primeiro filme: " + movieList.get(0).getTitle());
        Utils.print(movieList);
        Utils.print("toString do filme: " + movieList.get(0).toString());
    }
}