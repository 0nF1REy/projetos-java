package br.com.alanryan.datetime.app;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Alan");
        funcionarios.add("Sarah");
        funcionarios.add("Stella");

        System.out.println(funcionarios);
        System.out.println("- - -");
        System.out.println(funcionarios.get(1));
        System.out.println("- - -");

        Set<String> produtos = new HashSet<>();
        produtos.add("Água");
        produtos.add("Coca-cola");
        produtos.add("Água");

        System.out.println(produtos);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Elaine");

        System.out.println(clientes);
        System.out.println(clientes.get(3));
    }
}
