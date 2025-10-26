package br.com.alanryan.arraylistadvancedchallenge;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Conta: " + accountNumber + ", Saldo: R$" + balance;
    }
}
