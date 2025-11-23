package br.com.alanryan.lambdas.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = (a, b) -> a * b;
        System.out.println("5 x 7 = " + multiplicacao.multiplicar(5, 7));
    }
}
