package br.com.alanryan.exercise.primes;

public class PrimeNumbers {

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public void listPrimes(int limit) {
        System.out.println("Números primos até " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}
