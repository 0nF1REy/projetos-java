public class Matrizes {
    public static void main(String[] args) {

        // Matriz 3x4
        double[][] notasAlunos = new double[3][4];

        // ===================
        // Preenchimento Manual
        // ===================
        // Vetores (linhas da matriz)
        // Vetor 1
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        // Vetor 2
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        // Vetor 3
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        // ==========================================
        // Declaração de arrays unidimensionais (vetores)
        // ==========================================

        double[] notasAluno1 = {7, 8, 9, 10};
        double[] notasAluno2 = {8, 6, 7, 10};

        // ========================
        // Impressão da matriz inicial
        // ========================
        System.out.println("Matriz notasAlunos:");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        // ======================
        // Alteração de um valor
        // ======================
        notasAlunos[1][3] = 8;

        // ===========================
        // Impressão após modificação
        // ===========================
        System.out.println("\nMatriz atualizada (nota final do aluno 2 alterada para 8):");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        // =========================
        // Cálculo da média por aluno
        // =========================
        System.out.println("\nMédia de cada aluno:");
        for (int i = 0; i < notasAlunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            double media = soma / notasAlunos[i].length;
            System.out.println("Aluno " + (i + 1) + ": média = " + media);
        }
    }
}
