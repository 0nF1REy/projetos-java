package br.com.alanryan.lambdas.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numeros.replaceAll(n -> n * 3);
        System.out.println("Lista multiplicada por 3: " + numeros);
    }
}
