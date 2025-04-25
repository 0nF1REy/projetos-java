package animais;

public class Gato {

    private String nome;
    private String tutor;
    private String raca;

    // get
    public String getNome() {

    }

    public String getTutor() {
        return tutor;
    }

    public String getRaca() {
        return raca;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void comer() {
        System.out.println("O gato está comendo");
    }

    public void emitirSom() {
        System.out.println("O gato está miando");
    }
}