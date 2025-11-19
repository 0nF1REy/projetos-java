package pessoas;

public class Atendente {
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

    public void agendarConsultas() {
        System.out.println("Agendando consultas");
    }
}