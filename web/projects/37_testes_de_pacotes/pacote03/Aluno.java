package pacote03;

// Classe Aluno que define as propriedades e comportamentos de um aluno.

public class Aluno {

    // Atributos (propriedades do aluno)
    private String nome;
    int idade;

    // Métodos (ações ou comportamentos da classe)
    // Getter para obter o atributo do aluno ============
    public String getNome() {
        return nome;
    }

    // Setter para definir o atributo do aluno ============
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            this.idade = idade;
            System.out.println("Idade cadastrada");
        } else {
            System.out.println("Erro! Idade é inválida");
        }
    }
}

// Descoberta pessoal:
// Exemplos de modificadores de acesso:
// - public: acesso liberado para outras classes.
// - private: acesso restrito apenas dentro da própria classe.
// - protected: acesso permitido dentro da mesma classe, do mesmo pacote, e também por subclasses.
//
// Exemplos de tipo de retorno:
// - void: o método não retorna nenhum valor.
// - int: o método retorna um número inteiro.
// - String: o método retorna um texto (cadeia de caracteres).