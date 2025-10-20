package br.com.alanryan.exercise.animals;

public class MainAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        ((Dog) dog).wagTail();
        ((Cat) cat).scratchFurniture();
    }
}
