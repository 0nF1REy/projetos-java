import java.io.Console;
import java.util.Scanner;

// ======================================================
// Lê o nome do usuário via Scanner e exibe uma saudação.
// ======================================================
public class UserInputGreeting {
    public static void main(String[] args) {
        System.out.println("=================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("-----------------");

        // Verificação se a variável não está vazia
        if (name.isEmpty()) {
            System.out.println("Você não digitou nenhum nome.");
        } else {
            System.out.println("Olá, " + name);
        }

        scanner.close();
        System.out.println("=================");
    }
}

// =======================================================================
// Exibe uma mensagem com a banda/artista favorito passado como argumento.
// =======================================================================
class ArgsFavoriteArtist {
    public static void main(String[] args) {
        System.out.println("=================");
        if (args.length > 0) {
            System.out.println("A sua banda/artista favorito é " + args[0] + "? Que incrível escolha!");
        } else {
            System.out.println("Nenhum artista ou banda favorita foi fornecido.");
        }
        System.out.println("=================");
    }
}

// =================================================
// Usa Console para perguntar e exibir uma resposta.
// =================================================
class ConsoleLanguageQuestion {
    public static void main(String[] args) {
        System.out.println("=================");
        Console console = System.console();
        if (console == null) {
            System.out.println("Console não disponível.");
            return;
        }
        System.out.println("Qual é a minha linguagem preferida?");
        String name = console.readLine();
        System.out.println("-----------------");
        System.out.println(name + ", é claro!");
        System.out.println("=================");
    }
}
