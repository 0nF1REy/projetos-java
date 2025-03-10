public class FactorNumber {

    interface FactorialNumber {
        boolean test(int a, int b);
    }

    public static void main(String[] args) {
        FactorialNumber isFactor = (a, b) -> (b % a) == 0;

        if (isFactor.test(5, 9)) {
            System.out.println("5 is a factor of 9");
        } else {
            System.out.println("5 is not a factor of 9");
        }
    }
}
