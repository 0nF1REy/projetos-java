package com.alanryan.exceptionchallenge;

import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número:");
            double number1 = input.nextDouble();

            System.out.println("Digite o segundo número:");
            double number2 = input.nextDouble();

            try {
                double result = number1 / number2;
                System.out.println("Resultado da divisão: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero!");
            }
        }
    }
}
