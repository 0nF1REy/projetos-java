package exemplo02.visao;

import exemplo02.modelo.Funcionario;
import exemplo02.controle.CadastroFuncionario;

public class TestarFuncionario {
    public static void main(String[] args) {
        CadastroFuncionario cadastro = new CadastroFuncionario();

        Funcionario f1 = new Funcionario();
        f1.setNome("Alan Ryan");
        f1.setEndereco("Rua Exemplo, 123");
        f1.setFuncao("Desenvolvedor");
        f1.setSalario(4500.00);
        f1.setAdmissao("01/03/2025");

        cadastro.cadastrarFuncionario(f1);

        cadastro.exibirFuncionariosSalvos();
    }
}
