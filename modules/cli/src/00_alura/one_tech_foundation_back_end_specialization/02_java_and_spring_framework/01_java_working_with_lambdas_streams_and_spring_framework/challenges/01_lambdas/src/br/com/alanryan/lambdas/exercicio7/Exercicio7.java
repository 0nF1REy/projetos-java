package br.com.alanryan.lambdas.exercicio7;

public class Exercicio7 {
    public static void main(String[] args) {
        Divisao divisao = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão por zero não permitida");
            return a / b;
        };

        try {
            System.out.println("10 / 2 = " + divisao.dividir(10, 2));
            System.out.println("5 / 0 = " + divisao.dividir(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
