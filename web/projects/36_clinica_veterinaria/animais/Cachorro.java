package animais;

public class Cachorro extends Animal {

//    ============== Antes da refatoração ==============
//    private String nome;
//    private String tutor;
//    private String raca;


    private boolean ehAdestrado;

    // Construtor com 4 parâmetros
    public Cachorro(String nome, String tutor, String raca, boolean ehAdestrado) {
        super(nome, tutor, raca);
        this.ehAdestrado = ehAdestrado;
    }

    // Construtor sem parâmetros
    public Cachorro() {
        super("", "", "");
    }

    public boolean isEhAdestrado() {
        return ehAdestrado;
    }

    public void setEhAdestrado(boolean ehAdestrado) {
        this.ehAdestrado = ehAdestrado;
    }

    public void latir() {
        System.out.println("O cachorro está latindo");
    }

    public void comer() {
        System.out.println("O cachorro está comendo");
    }

    public void emitirSom() {
        System.out.println("O cachorro está emitindo som");
    }
}
