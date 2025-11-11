package br.com.alanryan.exercise.vehicles;

public class MainCar {
    public static void main(String[] args) {
        CarModel civic = new CarModel();
        civic.setModelName("Honda Civic");
        civic.setYearlyPrices(95000, 89000, 97000);
        civic.showInfo();
    }
}
