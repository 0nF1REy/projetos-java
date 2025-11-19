// Classe para representar um nó da lista
class Node {
    int data;   // dado armazenado
    Node next;  // ponteiro para o próximo nó

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TraverseLinkedList {
    public static void main(String[] args) {
        // Criando nós e encadeando manualmente
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Ligando os nós
        first.next = second;
        second.next = third;

        // Percorrendo a lista do início até o fim
        Node current = first;
        System.out.println("Percorrendo a lista encadeada:");
        while (current != null) {
            System.out.println("Valor do nó: " + current.data);
            current = current.next; // Avança para o próximo nó
        }

        System.out.println("Fim da lista.");
    }
}
