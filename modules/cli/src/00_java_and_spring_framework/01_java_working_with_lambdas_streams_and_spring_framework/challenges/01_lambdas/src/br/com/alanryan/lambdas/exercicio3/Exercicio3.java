package br.com.alanryan.lambdas.exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {
        ConverteMaiusculo maiusculo = str -> str.toUpperCase();
        System.out.println(maiusculo.converter("olá mundo"));
    }
}
