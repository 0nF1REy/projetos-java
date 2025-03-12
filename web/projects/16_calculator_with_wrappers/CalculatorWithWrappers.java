public class CalculatorWithWrappers {
    // Usando classes wrapper em vez de tipos primitivos
    Double numero1;
    Double numero2;

    // Método para somar os números
    Double soma() {
        return numero1 + numero2;
    }

    // Construtor da classe
    public CalculatorWithWrappers(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public static void main(String[] args) {
        // Criando instâncias da classe CalculatorWithWrappers
        CalculatorWithWrappers calculadora = new CalculatorWithWrappers(6.5, 9.5);
        CalculatorWithWrappers calculadora2 = new CalculatorWithWrappers(3.5, 8.5);
        CalculatorWithWrappers calculadora3 = new CalculatorWithWrappers(15.5, 31.5);

        System.out.println("==================================");
        // Imprimindo os valores de numero1 e numero2 para cada objeto
        System.out.println("Calculadora 1 - numero1: " + calculadora.numero1 + ", numero2: " + calculadora.numero2);
        System.out.println("Calculadora 2 - numero1: " + calculadora2.numero1 + ", numero2: " + calculadora2.numero2);
        System.out.println("Calculadora 3 - numero1: " + calculadora3.numero1 + ", numero2: " + calculadora3.numero2);

        System.out.println("- - - - - - -");
        System.out.println(calculadora.numero1.equals(calculadora2.numero1));
        System.out.println("- - - - - - -");

        // Imprimindo o resultado da soma para o primeiro objeto
        System.out.println("Resultado da soma da calculadora 1: " + calculadora.soma());
        System.out.println("==================================");
    }
}
