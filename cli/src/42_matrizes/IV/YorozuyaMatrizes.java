public class YorozuyaMatrizes {
    public static void main(String[] args) {

        // Matriz 3x4
        double[][] pontuacoesMissoes = new double[3][4];

        // Personagem 1: Gintoki
        pontuacoesMissoes[0][0] = 85.0;
        pontuacoesMissoes[0][1] = 90.0;
        pontuacoesMissoes[0][2] = 75.0;
        pontuacoesMissoes[0][3] = 80.0;

        // Personagem 2: Shinpachi
        pontuacoesMissoes[1][0] = 70.0;
        pontuacoesMissoes[1][1] = 75.0;
        pontuacoesMissoes[1][2] = 80.0;
        pontuacoesMissoes[1][3] = 60.0;

        // Personagem 3: Kagura
        pontuacoesMissoes[2][0] = 80.0;
        pontuacoesMissoes[2][1] = 65.0;
        pontuacoesMissoes[2][2] = 85.0;
        pontuacoesMissoes[2][3] = 90.0;

        System.out.println("Pontuações iniciais das missões da Yorozuya:");
        imprimirMatriz(pontuacoesMissoes);

        System.out.println("Cálculo da média das pontuações das missões por personagem:");
        calcularMedias(pontuacoesMissoes);
    }

    public static void imprimirMatriz(double[][] matriz) {
        String[] personagens = {"Gintoki", "Shinpachi", "Kagura"};
        String[] missoes = {
                "Defender a cidade",
                "Caçar ladrão",
                "Entrega urgente",
                "Corrida de rickshaws"
        };

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(personagens[i] + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("  %-18s : %.2f%n", missoes[j], matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void calcularMedias(double[][] matriz) {
        String[] personagens = {"Gintoki", "Shinpachi", "Kagura"};
        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            double media = soma / matriz[i].length;
            System.out.printf("%s: média das pontuações = %.2f%n", personagens[i], media);
        }
    }
}
