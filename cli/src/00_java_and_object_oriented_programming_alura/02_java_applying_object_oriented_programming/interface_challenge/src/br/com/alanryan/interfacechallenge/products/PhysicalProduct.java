package br.com.alanryan.interfacechallenge.products;

public class PhysicalProduct implements Calculable {
    private String name;
    private double basePrice;

    public PhysicalProduct(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.08;
    }
}
