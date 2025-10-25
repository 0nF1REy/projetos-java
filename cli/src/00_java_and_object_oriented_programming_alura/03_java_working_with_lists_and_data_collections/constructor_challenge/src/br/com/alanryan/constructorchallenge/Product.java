package br.com.alanryan.constructorchallenge;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Preço: R$" + price + ", Quantidade: " + quantity;
    }
}
