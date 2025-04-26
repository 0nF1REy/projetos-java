package pacote02;

// Classe responsável pela definição da estrutura de dados e comportamentos de um Produto

public class Produto {

    // Estruturação de dados do Produto
    // Atributos ===================================================================
    String nome;
    String marca;
    float valor;

    // Comportamento do Produto
    // Construtores ================================================================
    Produto() {

    }

    Produto(String nome) {
        this.nome = nome;
    }

    Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}

// Descoberta pessoal:
// O construtor vazio permite criar o objeto primeiro e depois atribuir valores aos atributos.
// Essa prática é parecida com bancos de dados: primeiro criamos a estrutura (como uma tabela vazia),
// e depois inserimos os dados conforme a necessidade.
//
// Exemplo em banco de dados:
// 1. Criamos uma tabela sem dados:
//    CREATE TABLE produto (nome VARCHAR(100), marca VARCHAR(100), valor FLOAT);
//
// 2. Depois inserimos os dados na tabela:
//    INSERT INTO produto (nome, marca, valor) VALUES ('Celular', 'Samsung', 1200.50);
//
// O mesmo conceito é aplicado ao código: primeiro criamos o objeto (estrutura vazia)
// e depois atribuimos os valores aos atributos (como o comando INSERT em banco).
