package minha_calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(calc.soma(1, 2));
        System.out.println(calc.soma(1.0, 2.0));
    }

}