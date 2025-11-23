package br.com.alanryan.arraylistadvancedchallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Maçã");
        stringList.add("Banana");
        stringList.add("Laranja");

        for(String item : stringList) {
            System.out.println(item);
        }

        Dog dog = new Dog("Rex");
        Animal animal = null;
        if(dog instanceof Animal) {
            animal = (Animal) dog;
        }
        System.out.println(animal);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Caderno", 12.5));
        products.add(new Product("Caneta", 3.0));
        products.add(new Product("Mochila", 85.0));

        double total = 0;
        for(Product p : products) {
            total += p.getPrice();
        }
        System.out.println("Preço médio dos produtos: R$" + (total / products.size()));

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Square(4));

        for(Shape s : shapes) {
            System.out.println("Área: " + s.calculateArea());
        }

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(101, 500.0));
        accounts.add(new BankAccount(102, 1200.0));
        accounts.add(new BankAccount(103, 800.0));

        BankAccount richest = accounts.get(0);
        for(BankAccount acc : accounts) {
            if(acc.getBalance() > richest.getBalance()) {
                richest = acc;
            }
        }
        System.out.println("Conta com maior saldo: " + richest);
    }
}
