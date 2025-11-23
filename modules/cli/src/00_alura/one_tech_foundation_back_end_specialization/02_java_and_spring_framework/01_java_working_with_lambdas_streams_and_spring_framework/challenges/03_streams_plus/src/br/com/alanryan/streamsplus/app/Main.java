package br.com.alanryan.streamsplus.app;

import br.com.alanryan.streamsplus.util.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // ============================
        // EXERCÍCIO 1
        // ============================
        System.out.println("=== Exercício 1 ===");
        List<Integer> numeros1 = Arrays.asList(10, 20, 30, 40, 50);

        Integer maior = numeros1.stream()
                .max(Integer::compareTo)
                .orElse(null);

        System.out.println("Maior número: " + maior);
        System.out.println();


        // ============================
        // EXERCÍCIO 2
        // ============================
        System.out.println("=== Exercício 2 ===");
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupadas = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupadas);
        System.out.println();


        // ============================
        // EXERCÍCIO 3
        // ============================
        System.out.println("=== Exercício 3 ===");
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String resultado = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(resultado);
        System.out.println();


        // ============================
        // EXERCÍCIO 4
        // ============================
        System.out.println("=== Exercício 4 ===");
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer somaQuadrados = numeros2.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Soma dos quadrados dos pares: " + somaQuadrados);
        System.out.println();


        // ============================
        // EXERCÍCIO 5
        // ============================
        System.out.println("=== Exercício 5 ===");
        List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> particionado = numeros3.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Pares: " + particionado.get(true));
        System.out.println("Ímpares: " + particionado.get(false));
        System.out.println();


        // ============================
        // PRODUTOS PARA OS PRÓXIMOS
        // ============================
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );


        // ============================
        // EXERCÍCIO 6
        // ============================
        System.out.println("=== Exercício 6 ===");

        Map<String, List<Produto>> produtosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println(produtosPorCategoria);
        System.out.println();


        // ============================
        // EXERCÍCIO 7
        // ============================
        System.out.println("=== Exercício 7 ===");

        Map<String, Long> contagemPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));

        System.out.println(contagemPorCategoria);
        System.out.println();


        // ============================
        // EXERCÍCIO 8
        // ============================
        System.out.println("=== Exercício 8 ===");

        Map<String, Optional<Produto>> maisCarosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))
                ));

        System.out.println(maisCarosPorCategoria);
        System.out.println();


        // ============================
        // EXERCÍCIO 9
        // ============================
        System.out.println("=== Exercício 9 ===");

        Map<String, Double> totalPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)
                ));

        System.out.println(totalPorCategoria);
        System.out.println();
    }
}
