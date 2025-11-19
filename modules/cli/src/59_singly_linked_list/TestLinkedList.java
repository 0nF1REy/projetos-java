// Classe para testar a lista ligada
public class TestLinkedList {
    public static void main(String[] args) {
        S_Linklist llist = new S_Linklist();
        llist.appendNode(new IntNode(3));
        llist.appendNode(new IntNode(7));
        llist.appendNode(new IntNode(0));

        System.out.println("Conteúdo da lista ligada:");
        llist.printList();
    }
}
