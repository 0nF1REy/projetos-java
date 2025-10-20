package br.com.alanryan.exercise.primes;

public class PrimeGenerator extends PrimeNumbers {

    public int generateNextPrime(int start) {
        int next = start + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
}
