import java.time.Year;

public class Car {

    // ATRIBUTOS
    private String model;
    private int year;
    private String color;

    // CONSTRUTOR
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Método para exibir a ficha técnica
    void showTechnicalSheet() {
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Cor: " + color);
        System.out.println("Idade: " + calculateCarAge() + " years");
        System.out.println();
    }

    // Método para calcular a idade
    int calculateCarAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }
}
