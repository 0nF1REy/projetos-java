public class LoopFor {
    public static void main(String[] args) {

        System.out.println("===========");
        for (int i = 1; i <= 5; i++) { // Incremento
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("-- -- -- --");
        for (int i = 5; i > 0; i--) { // Decremento
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("-- -- -- --");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        System.out.println("-- -- -- --");
        int count = 0;
        for (;count < 10;) {
            System.out.println("O valor de count é: " + count);
            count += 2;
        }

        System.out.println("-- -- -- --");
        for (int cont=0; cont < 10; cont += 2) {
            System.out.println("O valor de cont é: " + cont);
        }

        System.out.println("-- -- -- --");
        int soma = 0;
        for (int i=1; i < 5; soma += i++);
        System.out.println("O valor da soma é: " + soma);

        System.out.println("-- -- -- --");
        int[] valores = {1, 2, 3, 4, 5};

        for (int numero : valores) {
            System.out.println("O valor é: " + numero);
        }

        System.out.println("-- -- -- --");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println("O valor é: " + valores[i]);
        }

        System.out.println("-- -- -- --");
        int[] numerosCrescente = {1, 2, 3, 4, 5};
        for (int numero : numerosCrescente) {
            System.out.println("O valor é: " + numero);
        }

        System.out.println("-- -- -- --");
        int[] numerosDecrescente = {5, 4, 3, 2, 1};
        for (int numero : numerosDecrescente) {
            System.out.println("O valor é: " + numero);
        }

        try {
            System.out.println("-- -- -- --");
            System.out.println("Preparando para iniciar o loop infinito em 3 segundos...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("A pausa foi interrompida.");
        }

        System.out.println("-- -- -- --");
        for (;;) {
            System.out.println("Loop infinito em ação... cuidado! 😈");
        }
    }
}
