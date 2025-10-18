package exemplo02.visao;

import exemplo02.controle.CadastroFuncionario;
import exemplo02.controle.CadastroCliente;
import exemplo02.modelo.Funcionario;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        CadastroCliente cadastroCliente = new CadastroCliente();

        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("\n=== Cadastrar Funcionário ===");
                    Funcionario f = new Funcionario();
                    System.out.print("Nome: ");
                    f.setNome(scanner.nextLine());
                    System.out.print("Endereço: ");
                    f.setEndereco(scanner.nextLine());
                    System.out.print("Função: ");
                    f.setFuncao(scanner.nextLine());
                    System.out.print("Salário: ");
                    f.setSalario(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Data de Admissão: ");
                    f.setAdmissao(scanner.nextLine());

                    cadastroFuncionario.cadastrarFuncionario(f);
                    cadastroFuncionario.exibirFuncionariosSalvos();
                    break;

                case 2:
                    cadastroCliente.cadastrar();
                    cadastroCliente.exibirDados();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
