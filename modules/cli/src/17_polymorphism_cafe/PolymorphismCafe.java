// Classe base para tipos de café
abstract class Cafe {
    String tipo;

    public Cafe(String tipo) {
        this.tipo = tipo;
    }

    abstract void tomarCafe(); // Método abstrato, para ser implementado por subclasses
}

// Subclasse do tipo Café Expresso
class CafeExpresso extends Cafe {
    public CafeExpresso() {
        super("Expresso");
    }

    @Override
    void tomarCafe() {
        System.out.println("Hmmm! Um café expresso forte!");
    }
}

// Subclasse do tipo Café Latte
class CafeLatte extends Cafe {
    public CafeLatte() {
        super("Latte");
    }

    @Override
    void tomarCafe() {
        System.out.println("Hmmm! Um café latte suave!");
    }
}

public class PolymorphismCafe {
    public static void main(String[] args) {

        // Usando referências do tipo Cafe para diferentes tipos de café
        Cafe cafeExpresso = new CafeExpresso();
        Cafe cafeLatte = new CafeLatte();

        System.out.println("==================");
        cafeExpresso.tomarCafe();
        System.out.println("----");
        cafeLatte.tomarCafe();
        System.out.println("==================");
    }
}
