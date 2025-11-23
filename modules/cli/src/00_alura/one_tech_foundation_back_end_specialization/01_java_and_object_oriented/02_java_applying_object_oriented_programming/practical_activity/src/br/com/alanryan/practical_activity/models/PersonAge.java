package br.com.alanryan.practical_activity.models;

public class PersonAge {

    // ATRIBUTOS
    private String name;
    private int age;

    // CONSTRUTOR
    public PersonAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // MÉTODOS
    public void checkAge() {
        if(age >= 18) {
            System.out.println(name + " é maior de idade.");
        } else {
            System.out.println(name + " é menor de idade.");
        }
    }

    // ===================
    // Getters
    // ===================
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // ===================
    // Setters
    // ===================
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
