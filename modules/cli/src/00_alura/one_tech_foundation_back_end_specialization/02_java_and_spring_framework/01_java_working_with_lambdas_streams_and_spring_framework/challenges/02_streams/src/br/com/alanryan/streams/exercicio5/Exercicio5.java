package br.com.alanryan.streams.exercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio5 {

    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
            Arrays.asList(1, 2, 3, 4),
            Arrays.asList(5, 6, 7, 8),
            Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> primosOrdenados = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(Exercicio5::isPrimo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(primosOrdenados);
    }
}
