package br.com.alanryan.collections_streams.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenciadorFuncionarios {

    public void demoList() {
        System.out.println(">>> Demonstração de LIST (Funcionários)");
        
        List<String> funcionarios = new ArrayList<>(Arrays.asList("Alan", "Sarah", "Stella"));
        
        System.out.println("Lista de funcionários: " + funcionarios);
        
        // Verificação de segurança antes de acessar o índice
        if (funcionarios.size() > 1) {
            System.out.println("Segundo funcionário: " + funcionarios.get(1));
        }
    }
}
