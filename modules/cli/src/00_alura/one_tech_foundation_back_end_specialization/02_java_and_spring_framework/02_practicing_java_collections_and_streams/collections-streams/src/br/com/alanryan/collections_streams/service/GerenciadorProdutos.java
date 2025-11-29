package br.com.alanryan.collections_streams.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorProdutos {

    public void demoSet() {
        System.out.println(">>> Demonstração de SET (Produtos - Sem duplicatas)");
        
        // Set remove duplicatas automaticamente (ex: "Água")
        Set<String> produtos = new HashSet<>(Arrays.asList("Água", "Coca-cola", "Água"));
        
        System.out.println("Conjunto de produtos: " + produtos);
    }
}
