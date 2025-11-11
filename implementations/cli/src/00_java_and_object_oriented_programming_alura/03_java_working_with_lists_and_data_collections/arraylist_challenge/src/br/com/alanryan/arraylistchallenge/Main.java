package br.com.alanryan.arraylistchallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Sarah", 25));
        peopleList.add(new Person("Bob", 30));
        peopleList.add(new Person("Charlie", 22));

        System.out.println("Tamanho da lista: " + peopleList.size());
        System.out.println("Primeira pessoa: " + peopleList.get(0));
        System.out.println("Lista completa: " + peopleList);
    }
}
