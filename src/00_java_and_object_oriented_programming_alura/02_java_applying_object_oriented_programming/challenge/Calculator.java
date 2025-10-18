public class Calculator {

    int doubleNumber(int number) {
        return number * 2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.doubleNumber(5);
        System.out.println("O dobro de 5 é: " + result);
    }
}
