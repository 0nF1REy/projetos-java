package exemplo01.visao;

import exemplo01.controle.CadastroFuncionario;
import exemplo01.controle.CadastroCliente;
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
                    cadastroFuncionario.cadastrar();
                    cadastroFuncionario.exibirDados();
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
