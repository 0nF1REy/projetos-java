package br.com.alanryan.collections_streams.service;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorClientes {

    public void demoMap() {
        System.out.println(">>> Demonstração de MAP (Clientes - Chave/Valor)");
        
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Elaine");
        
        System.out.println("Mapa de clientes: " + clientes);
        System.out.println("Cliente com chave 3: " + clientes.get(3));
    }
}
