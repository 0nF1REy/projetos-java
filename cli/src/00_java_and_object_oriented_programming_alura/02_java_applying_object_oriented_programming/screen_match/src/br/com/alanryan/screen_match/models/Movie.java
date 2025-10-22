package br.com.alanryan.screen_match.models;

import br.com.alanryan.screen_match.calculations.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getRating() / 2;
    }
}
