package br.com.alanryan.practical_activity.models;

public class Product {

    // ATRIBUTOS
    private String name;
    private double price;

    // CONSTRUTOR
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // MÉTODOS
    public void applyDiscount(double percent) {
        price -= price * (percent / 100);
    }

    // ===================
    // Getters
    // ===================
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // ===================
    // Setters
    // ===================
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
