package com.alanryan.filejson;

public class Title {
    private String name;
    private String genre;
    private int year;

    public Title(String name, String genre, int year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
}
