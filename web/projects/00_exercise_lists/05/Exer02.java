import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];
        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int linha5 = 5;
        int maiorL5 = numerosAleatorios[linha5][0];
        int menorL5 = numerosAleatorios[linha5][0];

        for (int j = 1; j < numerosAleatorios[linha5].length; j++) {
            if (numerosAleatorios[linha5][j] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][j];
            }
            if (numerosAleatorios[linha5][j] < menorL5) {
                menorL5 = numerosAleatorios[linha5][j];
            }
        }

        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);

        int col7 = 7;
        int maiorC7 = numerosAleatorios[0][col7];
        int menorC7 = numerosAleatorios[0][col7];

        for (int i = 1; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][col7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][col7];
            }
            if (numerosAleatorios[i][col7] < menorC7) {
                menorC7 = numerosAleatorios[i][col7];
            }
        }

        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }
}
