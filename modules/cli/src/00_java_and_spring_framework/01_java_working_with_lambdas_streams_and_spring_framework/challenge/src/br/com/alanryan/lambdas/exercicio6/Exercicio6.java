package br.com.alanryan.lambdas.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Zara", "Alan", "Bruna", "Carlos"));
        nomes.sort(String::compareToIgnoreCase);
        System.out.println("Lista ordenada: " + nomes);
    }
}
