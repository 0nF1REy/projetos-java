package br.com.alanryan.interfacechallenge;

import br.com.alanryan.interfacechallenge.currency.CurrencyConverter;
import br.com.alanryan.interfacechallenge.geometry.RectangleCalculator;
import br.com.alanryan.interfacechallenge.multiplication.MultiplicationTableImpl;
import br.com.alanryan.interfacechallenge.temperature.StandardTemperatureConverter;
import br.com.alanryan.interfacechallenge.products.Book;
import br.com.alanryan.interfacechallenge.products.PhysicalProduct;
import br.com.alanryan.interfacechallenge.sales.Product;
import br.com.alanryan.interfacechallenge.sales.Service;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.println("USD 50.0 → BRL " + currencyConverter.convertDollarToReal(50));

        RectangleCalculator rectangle = new RectangleCalculator(5, 3);
        System.out.println("Área: " + rectangle.calculateArea());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());

        MultiplicationTableImpl table = new MultiplicationTableImpl(7);
        table.showTable();

        StandardTemperatureConverter temp = new StandardTemperatureConverter();
        System.out.println("25°C → " + temp.celsiusToFahrenheit(25) + "°F");
        System.out.println("77°F → " + temp.fahrenheitToCelsius(77) + "°C");

        Book book = new Book("Effective Java", 120.0);
        System.out.println("Preço final (livro): " + book.calculateFinalPrice());

        PhysicalProduct phone = new PhysicalProduct("Smartphone", 1500.0);
        System.out.println("Preço final (produto físico): " + phone.calculateFinalPrice());

        Product product = new Product("Fones de ouvido", 200.0);
        System.out.println("Preço total (produto): " + product.calculateTotalPrice(3, 0.1));

        Service service = new Service("Limpeza", 100.0);
        System.out.println("Preço total (serviço): " + service.calculateTotalPrice(5, 0.05));
    }
}
