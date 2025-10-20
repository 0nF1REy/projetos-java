package br.com.alanryan.exercise.bank;

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito realizado: R$" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Saque realizado: R$" + amount);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void showBalance() {
        System.out.println("Saldo atual: R$" + balance);
    }
}
