class Personagem {
    String nome;
    int saude;
    int mana;

    static int contagemDePersonagens = 0;

    // Construtor
    Personagem(String nome, int saude, int mana) {
        this.nome = nome;
        this.saude = saude;
        this.mana = mana;
        contagemDePersonagens++;
    }

    // Método
    void atacar() {
        System.out.println(nome + " atacou!");
    }

    // Método static
    static void mostrarContagem() {
        System.out.println("Número total de personagens: " + contagemDePersonagens);
    }
}

public class StaticHeroesClassObject {
    public static void main(String[] args) {
        // Objetos
        Personagem arthur = new Personagem("Arthur", 100, 50);
        Personagem luna = new Personagem("Luna", 80, 70);

        System.out.println("==================");

        arthur.atacar();
        luna.atacar();

        System.out.println("- - - - -");

        Personagem.mostrarContagem();

        System.out.println("==================");
    }
}
