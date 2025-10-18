import java.io.Console;
import java.util.ArrayList;
import java.util.Random;

public class WhileForTaskManager {
    public static void main(String[] args) {
        System.out.println("\n===================");
        ArrayList<String> tarefas = new ArrayList<>();
        Console console = System.console();

        String adicionarNovaTarefa = "s";

        // ==============================
        //  Estrutura de repetição [while]
        // ==============================
        while (adicionarNovaTarefa.equalsIgnoreCase("s")) { // Comparação case-insensitive
            System.out.println("Informe a tarefa: ");
            String tarefa = console.readLine();
            tarefas.add(tarefa);

            System.out.println("- - - - - -");
            System.out.println("Adicionar nova tarefa (s ou n)?");
            adicionarNovaTarefa = console.readLine();
            System.out.println("-----------");
        }

        System.out.println("\n===================");
        System.out.println("Suas tarefas:");
        System.out.println("---");

        // ============================
        //  Estrutura de repetição [for]
        // ============================
        for (int i = 0; i < tarefas.size(); i++) {
         System.out.println("[ ] " + tarefas.get(i));
        }
        System.out.println("==================\n");
    }
}

class ForWhileCodeSystem {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("\n============================================================");
        System.out.println("Hora de programar... Vamos aproveitar esse momento de criação.");

        int numeroDeFuncionalidades = random.nextInt(5) + 1;
        int funcionalidadesImplementadas = 0;

        System.out.println("- - - - - - - - - -");

        for (int i = 0; i < random.nextInt(5); i++) {
            System.out.println("O código é refatorado com calma... Cada linha sendo revisada e otimizada.");
        }
        System.out.println("- - - - - - - - - -");

        while (funcionalidadesImplementadas < numeroDeFuncionalidades) {
            System.out.println("Uma funcionalidade é implementada... Testando e ajustando o sistema.");
            funcionalidadesImplementadas++;
        }
        System.out.println("- - - - - - - - - -");

        System.out.println("O sistema foi finalizado e a sensação de realização e eficiência toma conta.");
        System.out.println("============================================================\n");
    }
}
