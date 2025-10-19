package br.com.alanryan.practical_activity.models;

public class Student {

    // ATRIBUTOS
    private String name;
    private double[] grades;

    // CONSTRUTOR
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // MÉTODOS
    public double calculateAverage() {
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // ===================
    // Getters
    // ===================
    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    // ===================
    // Setters
    // ===================
    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
}
