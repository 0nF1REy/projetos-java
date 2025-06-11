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
}
