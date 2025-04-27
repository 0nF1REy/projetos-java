package exemplo01.modelo;

public class Funcionario {
    private String nome;
    private String endereco;
    private double salario;
    private String funcao;
    private String admissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getAdmissao() {
        return admissao;
    }
    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }
}
