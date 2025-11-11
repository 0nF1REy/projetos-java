package br.com.alanryan.screen_match.models;

import br.com.alanryan.screen_match.calculations.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public Movie(String title, int releaseYear) {
        super(title, releaseYear);
    }

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

    @Override
    public String toString() {
        return "Filme: " + this.getTitle() + " (" + this.getReleaseYear() + ")";
    }
}
