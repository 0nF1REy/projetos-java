package br.com.alanryan.constructorchallenge;

public class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de validade: " + expirationDate;
    }
}
