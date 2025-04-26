package teste;

import animais.Gato;
import animais.Cachorro;
import pessoas.Medico;

public class Executa {
    public static void main(String[] args) {

        // Objeto Gato
        Gato gato = new Gato();
        gato.setNome("Amorinha");
        gato.setRaca("Persa");
        gato.setTutor("Carla");

        Gato gato2 = new Gato ("Maya", "Ana", "Angora");
        gato2.setNome("Sol");
        gato2.setGostaEscalar(true);

        System.out.println("----- Cadastro do Gato -----");
        System.out.println(
                "Nome do gato: " + gato2.getNome() +
                "\nRaça: " + gato2.getRaca() +
                "\nTutor: " + gato2.getTutor() +
                        "\nGosta de escalar?: " + (gato2.isGostaEscalar() ?
                        "Sim" : "Não")

        );

        gato2.comer();
        gato2.miar();
        gato2.emitirSom();

        System.out.println("");

        // Criando uma nova instância de Gato com o construtor que recebe nome, tutor e raça
        Gato gato3 = new Gato("Sol", "Ana", "Angora");

        // Exibindo o valor do objeto gato3 diretamente, sem sobrescrever o método toString()
        // Isso resulta na exibição do nome da classe seguido por um código hash (padrão do Java)
        System.out.println("Valor padrão de gato3: " + gato3);

        System.out.println("");

        // Objeto Cachorro
        Cachorro cachorro = new Cachorro("Thor", "Pedro", "Pincher", false);

        System.out.println("----- Cadastro do Cachorro -----");
        System.out.println(
                "Nome do cachorro: " + cachorro.getNome() +
                        "\nRaça: " + cachorro.getRaca() +
                        "\nTutor: " + cachorro.getTutor() +
                        "\nÉ adestrado?: " + (cachorro.isEhAdestrado() ?
                        "Sim" : "Não")
        );

        cachorro.comer();
        cachorro.latir();
        cachorro.emitirSom();

        System.out.println("");

        // Objeto Médico
        Medico medico = new Medico();
        medico.setCadastro(13456);
        medico.setNome("Fernando");
        medico.setEspecialidade("Clínico Geral");

        System.out.println(
                "Médico: " + medico.getNome() +
                "\nCadastro: " + medico.getCadastro() +
                "\nEspecialidade: " + medico.getEspecialidade()
        );

                medico.emitirReceita();
                medico.consultar();
    }
}
