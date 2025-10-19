package exemplo00.funcionarios;

public class Funcionario {
    private String nome;
    private String endereco;
    private double salario;
    private String funcao;
    private String admissao;

    // get
    public String Consultar_Nome() {
        return nome;
    }

    public String Consultar_Endereco() {
        return endereco;
    }

    public double Consultar_Salario() {
        return salario;
    }

    public String Consultar_Funcao() {
        return funcao;
    }

    public String Consultar_Admissao() {
        return admissao;
    }

    // set
    public void Atribuir_Endereco(String endereco) {
        this.endereco = endereco;
    }

    public void Atribuir_Salario(double salario) {
        this.salario = salario;
    }

    public void Atribuir_Nome(String nome) {
        this.nome = nome;
    }

    public void Atribuir_Funcao(String funcao) {
        this.funcao = funcao;
    }

    public void Atribuir_Admissao(String admissao) {
        this.admissao = admissao;
    }
}
