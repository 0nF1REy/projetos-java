package br.com.alanryan.exercise.animals;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Miau~");
    }

    public void scratchFurniture() {
        System.out.println("O gato está arranhando os móveis!");
    }
}
