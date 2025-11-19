import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileWithStream {
    public static void main(String[] args) {
        String caminhoArquivo = "meuarquivo.txt";

        File arquivo = new File(caminhoArquivo);

        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
            return;
        }

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(arquivo), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            System.out.println("Conteúdo do arquivo:");
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
