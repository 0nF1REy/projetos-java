public class Conditional {
    public static void main(String[] args) {
        int yearOfRelease = 2017;
        boolean includedInThePlan = true;
        double score = 8.1;
        String planType = "plus";

        if (yearOfRelease >= 2025) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme de ação que vale a pena assistir!");
        }

        if (includedInThePlan && planType.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}