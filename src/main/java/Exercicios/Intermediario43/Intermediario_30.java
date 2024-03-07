package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matricula = 0;
        int frequencia = 0;
        int mediaFinal = 0;
        int somadeNotas = 0;
        int maiorNota = 0;
        int menorNota = 0;
        int totalAlunosReprovados = 0;
        double porcentagemDeAlunosReprovados = 0;
        int alunosReprovadosFrequecia = 0;
        int nota1;
        int nota2;
        int nota3;

        for (int i = 1; i <= 2; i++) {

            System.out.printf("Informe a matrícula do aluno " + i + ":");
            matricula = scanner.nextInt();

            System.out.printf("Informe a primeira nota do aluno " + i + ":");
            nota1 = scanner.nextInt();

            System.out.printf("Informe a segunda nota do aluno " + i + ":");
            nota2 = scanner.nextInt();

            System.out.printf("Informe a terceira nota do aluno " + i + ":");
            nota3 = scanner.nextInt();

            System.out.printf("Informe a quantas aulas o aluno compareceu: ");
            frequencia = scanner.nextInt();

            mediaFinal = (nota1 + nota2 + nota3) / 3;

            if (mediaFinal >= 6 && frequencia >= 30) {
                System.out.println("Aluno com matrícula " + matricula + "\nMédia final de: " + mediaFinal + "\nFoi aprovado");

            } else {
                System.out.println("Aluno com matrícula " + matricula + "\nMédia final de: " + mediaFinal + "\nFoi reprovado");

            }
            if (mediaFinal > maiorNota) {
                maiorNota = mediaFinal;
            } else if (menorNota < mediaFinal) {
                menorNota = mediaFinal;
            } else {
                mediaFinal = menorNota;
            }
            if (mediaFinal < 6 && frequencia < 30) {
                totalAlunosReprovados++;

            } else if (frequencia < 30) {
                alunosReprovadosFrequecia++;
                totalAlunosReprovados += alunosReprovadosFrequecia;
            }
            porcentagemDeAlunosReprovados = (alunosReprovadosFrequecia * 100) / 2;

        }
        System.out.println("Maior média: " + maiorNota);
        System.out.println("Menor média: " + menorNota);
        System.out.println("Total de alunos reprovados: " + totalAlunosReprovados);
        System.out.println("Alunos reprovados por falta: " + porcentagemDeAlunosReprovados + " %");
    }
}

