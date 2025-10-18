package br.com.alanryan.practical_activity.app;

import br.com.alanryan.practical_activity.models.*;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Alan", 1234, 1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Saldo de " + account.holderName + ": " + account.getBalance());

        PersonAge person = new PersonAge("Alice", 17);
        person.checkAge();

        Product product = new Product("Notebook", 1500);
        product.applyDiscount(10);
        System.out.println("Preço com desconto: " + product.getPrice());

        Student student = new Student("Bob", new double[]{7, 8.5, 10});
        System.out.println("Média das notas: " + student.calculateAverage());

        Book book = new Book("1984", "George Orwell");
        book.displayDetails();
    }
}
