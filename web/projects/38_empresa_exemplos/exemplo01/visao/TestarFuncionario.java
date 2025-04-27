package exemplo01.visao;

import exemplo01.controle.CadastroFuncionario;

public class TestarFuncionario {
    public static void main(String[] args) {
        CadastroFuncionario cadastro = new CadastroFuncionario();
        cadastro.cadastrar();
        cadastro.exibirDados();
    }
}
