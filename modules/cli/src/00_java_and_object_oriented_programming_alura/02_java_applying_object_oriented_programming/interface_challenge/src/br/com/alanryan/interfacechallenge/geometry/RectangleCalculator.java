package br.com.alanryan.interfacechallenge.geometry;

public class RectangleCalculator implements GeometricCalculation {
    private double height;
    private double width;

    public RectangleCalculator(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
