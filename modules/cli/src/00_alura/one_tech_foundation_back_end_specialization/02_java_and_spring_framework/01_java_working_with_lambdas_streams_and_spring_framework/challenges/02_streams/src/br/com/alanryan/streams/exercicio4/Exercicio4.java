package br.com.alanryan.streams.exercicio4;

import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        palavras.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
