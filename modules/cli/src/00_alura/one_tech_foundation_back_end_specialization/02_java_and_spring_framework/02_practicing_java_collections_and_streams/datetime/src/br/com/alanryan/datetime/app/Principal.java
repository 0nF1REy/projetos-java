package br.com.alanryan.datetime.app;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        Principal app = new Principal();

        app.demoList();
        System.out.println("- - -");
        app.demoSet();
        System.out.println("- - -");
        app.demoMap();
        System.out.println("- - -");
        app.demoVendas();
        System.out.println("- - -");
        app.demoNotas();
    }

    // Demonstração de List
    private void demoList() {
        List<String> funcionarios = new ArrayList<>(Arrays.asList("Alan", "Sarah", "Stella"));

        System.out.println("Lista de funcionários:");
        System.out.println(funcionarios);
        System.out.println("Segundo funcionário: " + funcionarios.get(1));
    }

    // Demonstração de Set
    private void demoSet() {
        Set<String> produtos = new HashSet<>(Arrays.asList("Água", "Coca-cola", "Água"));

        System.out.println("Conjunto de produtos:");
        System.out.println(produtos);
    }

    // Demonstração de Map
    private void demoMap() {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Elaine");

        System.out.println("Mapa de clientes:");
        System.out.println(clientes);
        System.out.println("Cliente com chave 3: " + clientes.get(3));
    }

    // Demonstração de Streams com filtros, mapeamentos e reduções
    private void demoVendas() {
        // Funcionários com filtro
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");
        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Funcionários originais:");
        System.out.println(funcionarios);
        System.out.println("Funcionários cujo nome começa com A:");
        System.out.println(funcionariosLetraA);
        System.out.println("- - -");

        // Valor de vendas e comissão
        List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
        List<Double> comissao = valorVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());

        System.out.println("Valores de vendas:");
        System.out.println(valorVendas);
        System.out.println("Comissões (5%):");
        System.out.println(comissao);

        // Soma total das vendas
        double totalVendas = valorVendas.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total de vendas: " + totalVendas);
    }

    // Demonstração de cálculo de média, menor e maior nota
    private void demoNotas() {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        // Soma total usando reduce
        double soma = notas.stream()
                .reduce(0.0, Double::sum);

        // Cálculo da média
        double media = soma / notas.size();

        // Menor e maior nota
        double menorNota = notas.stream().min(Double::compare).orElse(0.0);
        double maiorNota = notas.stream().max(Double::compare).orElse(0.0);

        // Exibição
        System.out.println("Notas dos alunos:");
        System.out.println(notas);
        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota foi: " + menorNota);
        System.out.println("A maior nota foi: " + maiorNota);
    }
}
