package Exer03_aluno;

public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double [][] notasDisciplinas = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i=0; i< notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        }

        return  false;
    }

    double obterMedia(int indice) {
        double soma = 0;
        for (int j = 0; j < notasDisciplinas[indice].length; j++) {
            soma += notasDisciplinas[indice][j];
        }
        double media = soma / 4;
        return media;
    }
}
