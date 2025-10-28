package br.com.alanryan.collectionssortchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de números inteiros
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        Collections.sort(numbers);
        System.out.println("Lista de números ordenada: " + numbers);

        // Lista de títulos
        List<Title> titles = new ArrayList<>();
        titles.add(new Title("O Senhor dos Anéis"));
        titles.add(new Title("Harry Potter"));
        titles.add(new Title("Game of Thrones"));
        Collections.sort(titles);
        System.out.println("Títulos ordenados:");
        for (Title t : titles) {
            System.out.println(t);
        }

        // Polimorfismo com List: ArrayList e LinkedList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("ArrayList: " + names);

        names = new LinkedList<>(names);
        System.out.println("LinkedList: " + names);
    }
}
