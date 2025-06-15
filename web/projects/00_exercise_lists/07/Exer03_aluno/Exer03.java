package Exer03_aluno;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();

        // aluno.nomeDisciplinas = new String[3];
        for (int i=0; i<aluno.nomeDisciplinas.length; i++) {
            System.out.println("Entre com a matricula");
        }
    }
}
