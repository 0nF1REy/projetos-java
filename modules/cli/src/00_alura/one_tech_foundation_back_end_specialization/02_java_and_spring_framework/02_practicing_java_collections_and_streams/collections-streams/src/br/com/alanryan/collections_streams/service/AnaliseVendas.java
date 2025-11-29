package br.com.alanryan.collections_streams.service;

import java.util.List;
import java.util.stream.Collectors;

public class AnaliseVendas {

    public void processarDadosVendas() {
        System.out.println(">>> Demonstração de STREAMS (Vendas)");

        // 1. Filtragem de Nomes
        filtrarVendedoresPorLetraA();

        // 2. Map e Reduce (Valores)
        calcularComissoesETotais();
    }

    private void filtrarVendedoresPorLetraA() {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");
        
        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());
        
        System.out.println("Funcionários originais: " + funcionarios);
        System.out.println("Funcionários que começam com 'A': " + funcionariosLetraA);
    }

    private void calcularComissoesETotais() {
        List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
        
        // Cálculo de comissão (Map)
        List<Double> comissao = valorVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());
        
        // Soma total (Reduce/Sum)
        double totalVendas = valorVendas.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Valores de vendas: " + valorVendas);
        System.out.println("Comissões calculadas (5%): " + comissao);
        System.out.println("Total de vendas: " + totalVendas);
    }
}
