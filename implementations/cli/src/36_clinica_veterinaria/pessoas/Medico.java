package pessoas;

public class Medico {
    private String nome;
    private int cadastro;
    private String especialidade;

    // get
    public String getNome() {
        return nome;
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void consultar() {
        System.out.println("Consultando");
    }

    public void emitirReceita() {
        System.out.println("Emitindo receita");
    }
}