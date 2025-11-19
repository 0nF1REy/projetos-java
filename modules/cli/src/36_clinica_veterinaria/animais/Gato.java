package animais;

// extends = herança
public class Gato extends Animal {

    private boolean gostaEscalar;

    // A assinatura do método inclui o nome, o tipo de retorno e os parâmetros (com seus tipos).

    // Método construtor
    public Gato(String nome, String tutor, String raca) {
        super(nome, tutor, raca);
    }

    public Gato() {
        super("", "", "");
    }

    // Getter
    public boolean isGostaEscalar() {
        return gostaEscalar;
    }

    public void setGostaEscalar(boolean gostaEscalar) {
        this.gostaEscalar = gostaEscalar;
    }

    public void miar() {
        System.out.println("O gato está miando");
    }

    public void comer() {
        System.out.println("O gato está comendo");
    }

    public void emitirSom() {
        System.out.println("O gato está emitindo som");
    }

}
