public class Main {
    public static void main(String[] args) {

        // VARIÁVEIS
        boolean includedInThePlan = true;

        double score = 8.1,
                average = (9.8 + 6.3 + 8.0) / 3;

        int yearOfRelease = 2017,
                classification = (int) (average / 2); // CASTING EXPLÍCITO

        String johnWick2 = "John Wick: Um Novo Dia Para Matar",
                projectTitle = "Screen Match",
                synopsis = "Sequência de ação intensa com Keanu Reeves enfrentando novos inimigos em Nova York.";

        // TEXT BLOCK
        String output = """
                Esse é o %s!
                Filme: %s
                Ano de lançamento: %d
                Média: %.2f
                Sinopse: %s"""
                .formatted(projectTitle, johnWick2, yearOfRelease, average, synopsis);

        separator();
        System.out.println("Esse é o " + projectTitle + "!");
        System.out.println("Filme: " + johnWick2);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println(average);
        System.out.println(synopsis);

        separator();
        System.out.println(output);
        separator();

        s("Esse é o " + projectTitle + "!");
        s("Filme: " + johnWick2);
        s("Ano de lançamento: " + yearOfRelease);
        s(average);
        s(synopsis);
        separator();

        s(classification);
    }

    // MÉTODOS UTILITÁRIOS

    // Object -> Aceita qualquer tipo de dado
    static void s(Object text) {
        System.out.println(text);
    }

    static void separator() {
        System.out.println("------------");
    }
}
