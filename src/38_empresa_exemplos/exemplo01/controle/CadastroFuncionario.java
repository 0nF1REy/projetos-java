package exemplo01.controle;

import exemplo01.modelo.Funcionario;
import java.util.Scanner;

public class CadastroFuncionario {
    private Funcionario funcionario;
    private Scanner scanner;

    public CadastroFuncionario() {
        funcionario = new Funcionario();
        scanner = new Scanner(System.in);
    }

    public void cadastrar() {
        System.out.println("=== Cadastro de Funcionário ===");

        System.out.print("Nome: ");
        funcionario.setNome(scanner.nextLine());

        System.out.print("Endereço: ");
        funcionario.setEndereco(scanner.nextLine());

        System.out.print("Salário: ");
        funcionario.setSalario(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Função: ");
        funcionario.setFuncao(scanner.nextLine());

        System.out.print("Data de Admissão: ");
        funcionario.setAdmissao(scanner.nextLine());
    }

    public void exibirDados() {
        System.out.println("\n=== Dados do Funcionário ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.printf("Salário: R$ %.2f%n", funcionario.getSalario());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Data de Admissão: " + funcionario.getAdmissao());
        System.out.println("===============================");
    }
}
