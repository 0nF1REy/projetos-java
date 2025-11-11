import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];
        int jogada = 1;
        boolean ganhou = false;

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        while (!ganhou) {
            char sinal = (jogada % 2 == 1) ? 'X' : 'O';
            System.out.println("Vez do jogador " + ((sinal == 'X') ? "1" : "2") + ". Escolha linha e coluna (1-3).");

            int linha = -1, coluna = -1;
            boolean posicaoValida = false;

            while (!posicaoValida) {
                // Linha
                do {
                    System.out.print("Linha (1-3): ");
                    linha = scan.nextInt();
                } while (linha < 1 || linha > 3);

                // Coluna
                do {
                    System.out.print("Coluna (1-3): ");
                    coluna = scan.nextInt();
                } while (coluna < 1 || coluna > 3);

                linha--;
                coluna--;

                if (jogoVelha[linha][coluna] == '\u0000') {
                    jogoVelha[linha][coluna] = sinal;
                    posicaoValida = true;
                } else {
                    System.out.println("Posição já usada. Tente novamente.");
                }
            }

            // Imprime o tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    char c = (jogoVelha[i][j] == '\u0000') ? ' ' : jogoVelha[i][j];
                    System.out.print(c + " | ");
                }
                System.out.println();
            }

            // Verifica vitória
            if (verificaVitoria(jogoVelha, sinal)) {
                ganhou = true;
                System.out.println("Parabéns, jogador " + ((sinal == 'X') ? "1" : "2") + " ganhou!");
            } else if (jogada == 9) {
                System.out.println("Empate! Ninguém ganhou.");
                break;
            }

            jogada++;
        }

        scan.close();
    }

    public static boolean verificaVitoria(char[][] tab, char sinal) {
        for (int i = 0; i < 3; i++) {
            if ((tab[i][0] == sinal && tab[i][1] == sinal && tab[i][2] == sinal) || // linha
                    (tab[0][i] == sinal && tab[1][i] == sinal && tab[2][i] == sinal))   // coluna
                return true;
        }

        // Diagonais
        if ((tab[0][0] == sinal && tab[1][1] == sinal && tab[2][2] == sinal) ||
                (tab[0][2] == sinal && tab[1][1] == sinal && tab[2][0] == sinal))
            return true;

        return false;
    }
}
