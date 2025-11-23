package br.com.alanryan.lambdas.exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        VerificaPrimo verificaPrimo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println("7 é primo? " + verificaPrimo.isPrimo(7));
    }
}
