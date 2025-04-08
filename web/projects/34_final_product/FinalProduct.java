final class Produto {
    private String nome;
    private double preco;

    // Construtor usando "this"
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Produto: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
    }

    public void aplicarDesconto(double porcentagem) {
        this.preco = this.preco - (this.preco * porcentagem / 100);
    }
}

public class FinalProduct {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Fone de Ouvido", 250.00);
        Produto produto02 = new Produto("Teclado Mecânico", 350.00);

        System.out.println("\n======================");
        System.out.println("Antes do desconto:");
        System.out.println("-- -- -- -- --");
        produto01.exibirInformacoes();

        System.out.println("======================");
        produto02.exibirInformacoes();

        produto01.aplicarDesconto(10);
        produto02.aplicarDesconto(10);

        System.out.println("======================");
        System.out.println("Depois do desconto:");
        System.out.println("-- -- -- -- --");
        produto01.exibirInformacoes();

        System.out.println("======================");
        produto02.exibirInformacoes();

        System.out.println("======================\n");
    }
}
