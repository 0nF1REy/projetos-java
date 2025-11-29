package br.com.alanryan.collections_streams.app;

import br.com.alanryan.collections_streams.service.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO DEMONSTRAÇÃO ===");

        // Instanciação dos serviços
        GerenciadorFuncionarios funcService = new GerenciadorFuncionarios();
        GerenciadorProdutos prodService = new GerenciadorProdutos();
        GerenciadorClientes cliService = new GerenciadorClientes();
        AnaliseVendas vendasService = new AnaliseVendas();
        AnaliseNotas notasService = new AnaliseNotas();

        // Execução
        funcService.demoList();
        System.out.println("- - -");
        
        prodService.demoSet();
        System.out.println("- - -");
        
        cliService.demoMap();
        System.out.println("- - -");
        
        vendasService.processarDadosVendas();
        System.out.println("- - -");
        
        notasService.calcularEstatisticas();
        
        System.out.println("=== FIM DA DEMONSTRAÇÃO ===");
    }
}
