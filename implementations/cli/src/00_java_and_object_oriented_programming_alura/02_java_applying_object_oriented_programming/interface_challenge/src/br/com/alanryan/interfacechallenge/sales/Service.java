package br.com.alanryan.interfacechallenge.sales;

public class Service implements Sellable {
    private String description;
    private double hourlyRate;

    public Service(String description, double hourlyRate) {
        this.description = description;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateTotalPrice(int hours, double discountRate) {
        double total = hourlyRate * hours;
        return total - (total * discountRate);
    }
}
