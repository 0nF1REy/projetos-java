public class StringBasics {
    public static void main(String[] args) {

        System.out.println("\n==================");

        // Comparação de referências (False)
        String str1 = new String("Java s2");
        String str2 = new String("Java s2");
        System.out.println(str1 == str2);
        System.out.println("- -");

        String str3 = "Java s2";
        String str4 = "Java s2";

        // Comparação de referências (True)
        System.out.println(str3 == str4);
        System.out.println("- -");

        // Caracteres especiais
        System.out.println("Eu amo java\n");
        System.out.println("Java \té \tvida");
        System.out.println("- -");

        // String é um array de chars
        String nome = "Alan Ryan";
        System.out.println("Primeira letra do nome: " + nome.charAt(0));
        System.out.println("- -");

        // Posição de um caractere
        System.out.println("Posição da letra R no nome: " + nome.indexOf("R"));
        System.out.println("- -");

        // Sobrenome da pessoa
        int posicaoSobrenome = nome.indexOf(" ") + 1;
        System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome));
        System.out.println("- -");

        // Número de caracteres no nome
        System.out.println("Número de caracteres no nome: " + nome.length());
        System.out.println("- -");

        // Substituição de caracteres
        System.out.println(nome.replaceAll("a", "9"));
        System.out.println(nome);
        System.out.println("- -");

        // Concatenação
        String primeiroNome = "Tifa";
        String sobrenome = "Lockhart";
        System.out.println(primeiroNome + " " + sobrenome);
        System.out.println("- -");

        // Métodos para manipulação de strings
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.startsWith("Alan"));
        System.out.println(nome.endsWith("Lockhart"));
        System.out.println(nome.endsWith("n"));

        System.out.println("==================\n");
    }
}
