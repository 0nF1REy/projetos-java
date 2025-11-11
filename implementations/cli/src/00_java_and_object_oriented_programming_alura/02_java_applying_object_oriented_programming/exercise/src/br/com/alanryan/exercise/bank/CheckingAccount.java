package br.com.alanryan.exercise.bank;

public class CheckingAccount extends BankAccount {

    public void chargeMonthlyFee() {
        double fee = 12.50;
        if (balance >= fee) {
            balance -= fee;
            System.out.println("Taxa mensal cobrada: R$" + fee);
        } else {
            System.out.println("Saldo insuficiente para cobrar a taxa!");
        }
    }
}
