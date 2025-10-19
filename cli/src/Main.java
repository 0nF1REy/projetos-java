import java.io.File;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        // Diretório atual (onde o programa está sendo executado)
        File currentDir = new File(System.getProperty("user.dir"));

        System.out.println("Diretório atual: " + currentDir.getAbsolutePath());
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-5s %-40s %-20s%n", "#", "Nome da Pasta", "Última Modificação");
        System.out.println("----------------------------------------------------------");

        // Obtém lista de arquivos e diretórios
        File[] files = currentDir.listFiles();
        if (files == null) {
            System.out.println("Nenhum arquivo encontrado.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        int index = 1;

        for (File file : files) {
            if (file.isDirectory()) {
                String lastModified = sdf.format(file.lastModified());
                System.out.printf("%-5d %-40s %-20s%n", index++, file.getName(), lastModified);
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("Total de pastas: %d%n", (index - 1));
    }
}
