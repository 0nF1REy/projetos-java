package br.com.alanryan.interfacechallenge.sales;

public class Product implements Sellable {
    private String name;
    private double unitPrice;

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    @Override
    public double calculateTotalPrice(int quantity, double discountRate) {
        double total = unitPrice * quantity;
        return total - (total * discountRate);
    }
}
