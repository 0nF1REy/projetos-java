package br.com.alanryan.exercise.primes;

public class PrimeChecker extends PrimeNumbers {

    public void checkIfPrime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " é um número primo!");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}
