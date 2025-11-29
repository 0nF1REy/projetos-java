package br.com.alanryan.datetime.app;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Principal app = new Principal();

        app.demoList();
        System.out.println("- - -");
        app.demoSet();
        System.out.println("- - -");
        app.demoMap();
    }

    // Demonstração de List
    private void demoList() {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Alan");
        funcionarios.add("Sarah");
        funcionarios.add("Stella");

        System.out.println("Lista de funcionários:");
        System.out.println(funcionarios);
        System.out.println("Segundo funcionário: " + funcionarios.get(1));
    }

    // Demonstração de Set
    private void demoSet() {
        Set<String> produtos = new HashSet<>();
        produtos.add("Água");
        produtos.add("Coca-cola");
        produtos.add("Água");

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
}
