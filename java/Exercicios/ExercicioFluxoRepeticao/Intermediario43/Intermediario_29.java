package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notas = 0;
        int comparecimentoAsAulas = 0;
        int somadeNotas = 0;
        int mediaNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe a nota " + i + " do aluno:");
            notas = scanner.nextInt();
            somadeNotas += notas;
        }
        System.out.printf("Informe o número de aulas que o aluno compareceu: ");
        comparecimentoAsAulas = scanner.nextInt();

        if (mediaNotas < 6 && comparecimentoAsAulas < 40) {
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno apovado");

        }
        mediaNotas = (somadeNotas / 3);
    }
}
