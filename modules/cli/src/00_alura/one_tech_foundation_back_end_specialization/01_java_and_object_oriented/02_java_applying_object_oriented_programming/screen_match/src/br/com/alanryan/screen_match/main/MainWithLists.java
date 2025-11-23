package br.com.alanryan.screen_match.main;

import br.com.alanryan.screen_match.models.Movie;
import br.com.alanryan.screen_match.models.Serie;
import br.com.alanryan.screen_match.models.Title;
import br.com.alanryan.screen_match.utils.Utils;

import java.util.*;

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

        List<Title> list = new LinkedList<>();
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

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Layla");
        searchByArtist.add("John");
        searchByArtist.add("Adam Sandler");
        Utils.print(searchByArtist);

        Collections.sort(searchByArtist);
        Utils.print("Depois da ordenação");
        Utils.print(searchByArtist);
        Utils.print("Lista de títulos ordenados");
        Collections.sort(list);
        Utils.print(list);
        list.sort(Comparator.comparing(Title::getReleaseYear));
        Utils.print("Ordenando por ano");
        Utils.print(list);
    }
}
