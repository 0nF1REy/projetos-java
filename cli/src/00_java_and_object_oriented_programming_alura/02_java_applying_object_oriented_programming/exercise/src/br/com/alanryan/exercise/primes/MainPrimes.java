package br.com.alanryan.exercise.primes;

public class MainPrimes {
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        checker.checkIfPrime(19);

        PrimeGenerator generator = new PrimeGenerator();
        System.out.println("Próximo número primo após 19: " + generator.generateNextPrime(19));

        checker.listPrimes(30);
    }
}
