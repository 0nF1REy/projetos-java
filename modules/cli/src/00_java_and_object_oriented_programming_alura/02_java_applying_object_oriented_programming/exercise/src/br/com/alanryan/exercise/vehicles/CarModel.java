package br.com.alanryan.exercise.vehicles;

public class CarModel extends Car {

    @Override
    public void showInfo() {
        System.out.println("=== Informações do modelo do carro ===");
        super.showInfo();
    }
}
