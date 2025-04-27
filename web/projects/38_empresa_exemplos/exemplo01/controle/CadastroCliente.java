package exemplo01.controle;

import exemplo01.modelo.Cliente;
import java.util.Scanner;

public class CadastroCliente {
    private Cliente cliente;
    private Scanner scanner;

    public CadastroCliente() {
        cliente = new Cliente();
        scanner = new Scanner(System.in);
    }

    public void cadastrar() {
        System.out.println("=== Cadastro de Cliente ===");

        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("Email: ");
        cliente.setEmail(scanner.nextLine());

        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());
    }

    public void exibirDados() {
        System.out.println("\n=== Dados do Cliente ===");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("===========================");
    }
}
