package br.com.alanryan.exercise.bank;

public class MainBank {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.deposit(100);
        acc.chargeMonthlyFee();
        acc.showBalance();
    }
}
