package com.alanryan.exceptionchallenge;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite sua senha:");
            String password = input.nextLine();

            try {
                if (password.length() < 8) {
                    throw new InvalidPasswordException("A senha deve conter pelo menos 8 caracteres!");
                }
                System.out.println("Senha válida!");
            } catch (InvalidPasswordException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
