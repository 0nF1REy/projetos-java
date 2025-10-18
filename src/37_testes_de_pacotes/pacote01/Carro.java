package pacote01;

// Classe responsável pela definição da estrutura de dados e comportamentos de um Carro

public class Carro {

    // Atributos
    String nome;
    String marca;
    int anoFab;
    int vel;

    // Métodos
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void freiar(int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("BiBiBi");
    }
}
