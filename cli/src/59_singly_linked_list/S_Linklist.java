// Classe para representar a lista ligada simples
public class S_Linklist {
    IntNode first;
    IntNode last;
    int number_of_nodes;

    public S_Linklist() {
        first = null;
        last = null;
        number_of_nodes = 0;
    }

    // Adiciona um nó ao final da lista
    public void appendNode(IntNode newNode) {
        if (first == null) {  
            first = newNode;
            last = newNode;
        } else {            
            last.next = newNode;
            last = newNode;
        }
        number_of_nodes++;     
    }

    // Imprime todos os nós da lista
    public void printList() {
        IntNode current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
