package animais;

public class Animal {

    private String nome;
    private String tutor;
    private String raca;

    // Método construtor
    public Animal(String nome, String tutor, String raca) {
        this.nome = nome;
        this.tutor = tutor;
        this.raca = raca;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTutor() {
        return tutor;
    }

    public String getRaca() {
        return raca;
    }

    // Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void comer() {
        System.out.println("O pet está comendo");
    }

    public void emitirSom() {
        System.out.println("O pet está emitindo um som");
    }
}