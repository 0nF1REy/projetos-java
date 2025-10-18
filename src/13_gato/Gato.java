class Gato {
    // Atributos
    String raca;
    String nome;
    int idade;

    // Construtor
    Gato(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Método para fazer o gato miar
    void miar() {
        System.out.println(nome + " está miando: Miar!");
    }

    // Método para exibir informações do gato
    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        // Criando um objeto Gato
        Gato gato1 = new Gato("Bichano", "Siamês", 3);

        System.out.println("===========");
        // Chamando o método miar
        gato1.miar();
        System.out.println("- - - - - -");

        // Exibindo as informações do gato
        gato1.mostrarInfo();
        System.out.println("===========");
    }
}
