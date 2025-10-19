package exemplo00.testes;
import exemplo00.funcionarios.Funcionario;

public class TestarFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.Atribuir_Nome("Alan Ryan");
        funcionario.Atribuir_Endereco("Rua Exemplo, 123");
        funcionario.Atribuir_Salario(3500.00);
        funcionario.Atribuir_Funcao("Desenvolvedor de Sistemas");
        funcionario.Atribuir_Admissao("01/03/2025");

        System.out.println("Dados do Funcionário:");
        System.out.println("Nome: " + funcionario.Consultar_Nome());
        System.out.println("Endereço: " + funcionario.Consultar_Endereco());
        System.out.println("Salário: R$ " + funcionario.Consultar_Salario());
        System.out.println("Função: " + funcionario.Consultar_Funcao());
        System.out.println("Data de Admissão: " + funcionario.Consultar_Admissao());
    }
}
