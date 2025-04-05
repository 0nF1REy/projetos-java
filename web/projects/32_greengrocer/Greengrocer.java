public class Greengrocer {
    float price;
    String variety;

    // ====================
    //  Construtor da classe
    // ====================
    Greengrocer(float p, String v) {
        price = p;
        variety = v;
    }

    void displayIt() {
        System.out.printf("Variedade: %s, Preço: R$ %.2f%n", variety, price);
    }

    public static void main(String[] args) {
        Greengrocer apple = new Greengrocer(2.5f, "Maçã");
        Greengrocer banana = new Greengrocer(1.8f, "Banana");
        Greengrocer orange = new Greengrocer(3.2f, "Laranja");
        Greengrocer grape = new Greengrocer(4.5f, "Uva");

        System.out.println("\n======================");
        apple.displayIt();
        banana.displayIt();
        orange.displayIt();
        grape.displayIt();
        System.out.println("======================");
    }
}
