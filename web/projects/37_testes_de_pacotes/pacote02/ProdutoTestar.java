package pacote02;

// Classe responsável por testar a criação de objetos da classe Produto

public class ProdutoTestar {

    public static void main(String[] args) {

        // Construtor padrão:
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        // Construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 1.69f;

        // Construtor de três parâmetros:
        Produto p3 = new Produto("Borracha", "Mercur", 1.89f);

        // Objeto p1
        System.out.println("Nome: " + p1.nome +", Marca: " + p1.marca + ", Valor: " + p1.valor);

        // Objeto p2
        System.out.println("Nome: " + p2.nome +", Marca: " + p2.marca + ", Valor: " + p2.valor);

        // Objeto p3
        System.out.println("Nome: " + p3.nome +", Marca: " + p3.marca + ", Valor: " + p3.valor);
    }
}