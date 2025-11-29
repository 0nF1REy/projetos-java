package br.com.alanryan.collections_streams.service;

import java.util.List;

public class AnaliseNotas {

    public void calcularEstatisticas() {
        System.out.println(">>> Demonstração de STREAMS (Estatísticas de Notas)");
        
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        // Soma total usando reduce
        double soma = notas.stream()
                .reduce(0.0, Double::sum);

        // Cálculo da média
        double media = notas.isEmpty() ? 0.0 : soma / notas.size();

        // Menor e maior nota
        double menorNota = notas.stream().min(Double::compare).orElse(0.0);
        double maiorNota = notas.stream().max(Double::compare).orElse(0.0);

        System.out.println("Notas dos alunos: " + notas);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Maior nota: " + maiorNota);
    }
}
