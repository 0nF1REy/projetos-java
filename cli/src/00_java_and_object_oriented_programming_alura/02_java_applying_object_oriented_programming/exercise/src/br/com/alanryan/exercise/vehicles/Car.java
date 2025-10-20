package br.com.alanryan.exercise.vehicles;

public class Car {
    protected String modelName;
    protected double[] prices = new double[3];

    public void setModelName(String name) {
        this.modelName = name;
    }

    public void setYearlyPrices(double year1, double year2, double year3) {
        prices[0] = year1;
        prices[1] = year2;
        prices[2] = year3;
    }

    public double getMinPrice() {
        double min = prices[0];
        for (double p : prices) {
            if (p < min) min = p;
        }
        return min;
    }

    public double getMaxPrice() {
        double max = prices[0];
        for (double p : prices) {
            if (p > max) max = p;
        }
        return max;
    }

    public void showInfo() {
        System.out.println("Modelo: " + modelName);
        System.out.println("Menor preço: R$" + getMinPrice());
        System.out.println("Maior preço: R$" + getMaxPrice());
    }
}
