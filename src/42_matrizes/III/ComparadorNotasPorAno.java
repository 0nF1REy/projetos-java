public class ComparadorNotasPorAno {
    public static void main(String[] args) {

        double[][] notasAlunos2023 = new double[30][4];
        double[][] notasAlunos2024 = new double[30][4];

        // Preenchendo notas de 2023 (exemplo para 3 alunos)
        notasAlunos2023[0][0] = 10;
        notasAlunos2023[0][1] = 7;
        notasAlunos2023[0][2] = 9;
        notasAlunos2023[0][3] = 9.5;

        notasAlunos2023[1][0] = 9;
        notasAlunos2023[1][1] = 8;
        notasAlunos2023[1][2] = 7;
        notasAlunos2023[1][3] = 9;

        notasAlunos2023[2][0] = 8;
        notasAlunos2023[2][1] = 9;
        notasAlunos2023[2][2] = 10;
        notasAlunos2023[2][3] = 7;

        // Preenchendo notas de 2024 (exemplo para 3 alunos)
        notasAlunos2024[0][0] = 9;
        notasAlunos2024[0][1] = 8.5;
        notasAlunos2024[0][2] = 9.5;
        notasAlunos2024[0][3] = 10;

        notasAlunos2024[1][0] = 8;
        notasAlunos2024[1][1] = 7;
        notasAlunos2024[1][2] = 6.5;
        notasAlunos2024[1][3] = 8;

        notasAlunos2024[2][0] = 7;
        notasAlunos2024[2][1] = 9;
        notasAlunos2024[2][2] = 9;
        notasAlunos2024[2][3] = 7.5;

        for (int i = 0; i < 3; i++) {
            System.out.print("Aluno " + (i + 1) + " - 2023: ");
            for (int j = 0; j < 4; j++) {
                System.out.print(notasAlunos2023[i][j] + " ");
            }

            System.out.print(" | 2024: ");
            for (int j = 0; j < 4; j++) {
                System.out.print(notasAlunos2024[i][j] + " ");
            }
            System.out.println();
        }
    }
}
