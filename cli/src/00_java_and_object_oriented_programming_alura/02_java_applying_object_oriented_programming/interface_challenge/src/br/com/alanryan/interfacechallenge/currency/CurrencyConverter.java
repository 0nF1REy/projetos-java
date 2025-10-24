package br.com.alanryan.interfacechallenge.currency;

public class CurrencyConverter implements CurrencyConversion {
    private static final double EXCHANGE_RATE = 5.25;

    @Override
    public double convertDollarToReal(double dollarValue) {
        return dollarValue * EXCHANGE_RATE;
    }
}
