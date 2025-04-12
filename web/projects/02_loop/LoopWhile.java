public class LoopWhile {
    public static void main(String[] args) {

        int i = 1; // count ou cont
        int max = 10;

        System.out.println("========================");
        System.out.println("Contando até " + max + "...");
        System.out.println("-- -- -- -- -- -- -- --");

        while (i <= max) {
            System.out.println("O valor de i é igual a: " + i);
            i++;
        }

        System.out.println(i);

        System.out.println("========================");

        do {
            i++;
            System.out.println("O valor de i é igual a: " + i);
        } while (i < 13);

        System.out.println(i);
        System.out.println("========================");
    }
}
