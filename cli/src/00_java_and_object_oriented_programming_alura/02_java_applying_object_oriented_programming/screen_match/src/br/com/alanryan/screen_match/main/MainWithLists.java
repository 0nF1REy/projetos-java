package br.com.alanryan.screen_match.main;

import br.com.alanryan.screen_match.models.Movie;
import br.com.alanryan.screen_match.models.Serie;
import br.com.alanryan.screen_match.models.Title;
import br.com.alanryan.screen_match.utils.Utils;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.rate(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.rate(6);
        var alanMovie = new Movie("Dogville", 2003);
        alanMovie.rate(10);
        Serie lost = new Serie("Lost", 2000);

        Movie m1 = alanMovie;

        ArrayList<Title> list = new ArrayList<>();
        list.add(alanMovie);
        list.add(myMovie);
        list.add(otherMovie);
        list.add(lost);

        for (Title item: list) {
            Utils.print(item.getTitle());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                Utils.print("Classificação: " + movie.getClassification());
            }
        }
    }
}
