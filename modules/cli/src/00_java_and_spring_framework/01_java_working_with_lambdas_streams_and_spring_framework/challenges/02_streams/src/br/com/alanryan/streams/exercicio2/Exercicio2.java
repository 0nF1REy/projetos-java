package br.com.alanryan.streams.exercicio2;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
