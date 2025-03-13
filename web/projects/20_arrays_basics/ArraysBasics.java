import java.util.ArrayList;
import java.util.Collections;

public class ArraysBasics {
    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("React");
        tarefas.add("CSharp");
        tarefas.add("Java");
        tarefas.add("Angular");
        tarefas.add("MySQL");

        // Ordenando a lista em ordem alfabética
        Collections.sort(tarefas);

        System.out.println("==================");
        System.out.println("O primeiro item na lista é: " + tarefas.get(0));
        System.out.println("- - - - -");
        System.out.println("A quantidade total de elementos na lista é: " + tarefas.size());
        System.out.println("- - - - -");
        System.out.println("Os itens que precisam ser estudados são: " + tarefas);
        System.out.println("==================");
    }
}