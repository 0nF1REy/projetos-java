package br.com.alanryan.constructorchallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product("Caderno", 12.5, 10));
        productList.add(new Product("Caneta", 3.0, 50));
        productList.add(new Product("Mochila", 85.0, 5));

        System.out.println("Tamanho da lista: " + productList.size());
        System.out.println("Primeiro produto: " + productList.get(0));
        System.out.println("Lista completa: " + productList);

        PerishableProduct milk = new PerishableProduct("Leite", 6.5, 20, "30/10/2025");
        System.out.println("Produto perecível: " + milk);
    }
}
