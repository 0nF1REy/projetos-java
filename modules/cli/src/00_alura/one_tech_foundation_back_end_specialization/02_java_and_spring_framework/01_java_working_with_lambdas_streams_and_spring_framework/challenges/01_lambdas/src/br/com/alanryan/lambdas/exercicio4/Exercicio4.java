package br.com.alanryan.lambdas.exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        VerificarPalindromo palindromo = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        };
        System.out.println("arara é palíndromo? " + palindromo.verificar("arara"));
    }
}
