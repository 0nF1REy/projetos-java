interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("======");
        System.out.println("Au Au!");
        System.out.println("======");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.fazerSom();
    }
}