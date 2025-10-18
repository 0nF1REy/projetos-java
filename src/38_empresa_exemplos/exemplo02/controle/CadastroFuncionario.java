package exemplo02.controle;

import exemplo02.modelo.Funcionario;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

public class CadastroFuncionario {

    public void cadastrarFuncionario(Funcionario funcionario) {
        try {
            File pasta = new File("exemplo02/data");
            if (!pasta.exists()) {
                pasta.mkdirs();
            }

            try (FileWriter fw = new FileWriter("exemplo02/data/funcionarios.txt", true);
                 PrintWriter pw = new PrintWriter(fw)) {

                pw.println(
                        funcionario.getNome()      + ";" +
                                funcionario.getEndereco()  + ";" +
                                funcionario.getFuncao()    + ";" +
                                funcionario.getSalario()   + ";" +
                                funcionario.getAdmissao()
                );
                System.out.println("Funcionário cadastrado e salvo com sucesso!");
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionário: " + e.getMessage());
        }
    }

    public void exibirFuncionariosSalvos() {
        try (FileReader fr = new FileReader("exemplo02/data/funcionarios.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            System.out.println("\n--- Funcionários Cadastrados ---");
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                System.out.println("Nome:      " + dados[0]);
                System.out.println("Endereço:  " + dados[1]);
                System.out.println("Função:    " + dados[2]);
                System.out.printf("Salário:   R$ %.2f%n", Double.parseDouble(dados[3]));
                System.out.println("Admissão:  " + dados[4]);
                System.out.println("--------------------------------");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler funcionários: " + e.getMessage());
        }
    }
}
