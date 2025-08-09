import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileWithStream {
    public static void main(String[] args) {
        String caminhoArquivo = "meuarquivo.txt";
        String conteudo = "Este é um texto gravado usando FileOutputStream.\n" +
                "Exemplo básico de OutputStream em Java.\n";

        File arquivo = new File(caminhoArquivo);

        try (FileOutputStream fos = new FileOutputStream(arquivo)) {
            fos.write(conteudo.getBytes("UTF-8"));

            System.out.println("Conteúdo gravado com sucesso no arquivo: " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
