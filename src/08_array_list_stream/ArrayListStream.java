import java.util.ArrayList; // Importa a classe ArrayList para criar listas dinâmicas
import java.util.List; // Importa a interface List para definir a lista de forma genérica

public class ArrayListStream {
    public static void main(String[] args) {
        // Cria uma lista de strings chamada 'frutas'
        List<String> frutas = new ArrayList<>();

        // Adiciona elementos à lista
        frutas.add("maçã");
        frutas.add("banana");

        // Percorre a lista e imprime cada elemento usando Stream API
        frutas.stream().forEach(System.out::println);
    }
}