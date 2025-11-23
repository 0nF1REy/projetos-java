package br.com.alanryan.practical_activity.models;

public class Book {

    // ATRIBUTOS
    private String title;
    private String author;

    // CONSTRUTOR
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // MÉTODO
    public void displayDetails() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
    }

    // ===================
    // Getters
    // ===================
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // ===================
    // Setters
    // ===================
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
