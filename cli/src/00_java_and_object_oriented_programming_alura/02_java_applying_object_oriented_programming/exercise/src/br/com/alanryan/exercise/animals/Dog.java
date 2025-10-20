package br.com.alanryan.exercise.animals;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Au! Au!");
    }

    public void wagTail() {
        System.out.println("O cachorro está abanando o rabo felizmente!");
    }
}
