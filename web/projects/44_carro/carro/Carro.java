package carro;

public class Carro {
    String marca;
    String modelo;
    byte numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Método simples
    void exibirAutonomia() {
            System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    // Método com retorno
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
}
