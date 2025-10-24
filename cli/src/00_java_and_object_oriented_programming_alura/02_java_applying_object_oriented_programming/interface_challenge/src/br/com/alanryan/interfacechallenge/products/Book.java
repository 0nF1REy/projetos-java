package br.com.alanryan.interfacechallenge.products;

public class Book implements Calculable {
    private String title;
    private double basePrice;

    public Book(String title, double basePrice) {
        this.title = title;
        this.basePrice = basePrice;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 0.9;
    }
}
