import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileWithStream {
    public static void main(String[] args) {
        String caminhoArquivo = "meuarquivo.txt";

        File arquivo = new File(caminhoArquivo);

        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivo)) {
            int byteLido;
            System.out.println("Conteúdo do arquivo:");
            while ((byteLido = fis.read()) != -1) {
                System.out.print((char) byteLido);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
