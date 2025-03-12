public class PrimitiveTypes {

    public static void main(String[] args) {

        // Tipos de Dados Numéricos - Inteiros
        int num1 = 10, num2 = 20;
        System.out.println("===========");
        System.out.println("Num1 é igual a num2? " + (num1 == num2));

        // Tipos de Dados Numéricos - Decimais
        float num3 = 1.5f, num4 = 1.5f;
        System.out.println("Num3 é igual a num4? " + (num3 == num4));

        // Tipo de Dados - Char
        char letra1 = 'A', letra2 = 'a';
        System.out.println("Valor ASCII de Letra1: " + (int)letra1);
        System.out.println("Valor ASCII de Letra2: " + (int)letra2);
        System.out.println("Letra1 é igual a Letra2? " + (letra1 == letra2));
        System.out.println("- - - - - -");

        // Exemplo de soma com método
        System.out.println("Resultado da soma com método: " + soma4(2.5, 7.5));
        System.out.println("===========");
    }

    // Método para somar dois números double
    public static double soma4(double numero7, double numero8) {
        return numero7 + numero8;
    }
}
