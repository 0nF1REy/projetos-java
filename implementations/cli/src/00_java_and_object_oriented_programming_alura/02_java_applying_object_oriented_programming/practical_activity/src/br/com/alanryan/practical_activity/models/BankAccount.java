package br.com.alanryan.practical_activity.models;

public class BankAccount {

    // ATRIBUTOS
    private int accountNumber;
    private double balance;
    public String holderName;

    // CONSTRUTOR
    public BankAccount(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // MÉTODOS
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // ===================
    // Getters
    // ===================
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // ===================
    // Setters
    // ===================
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
