package pessoas;

public class Auxiliar {
    private String nome;
    private int cadastro;

    // get
    public String getNome() {
        return nome;
    }

    public int getCadastro() {
        return cadastro;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public void realizarBanho() {
        System.out.println("Realizando banho");
    }

    public void realizarTosa() {
        System.out.println("Realizando tosa");
    }
}