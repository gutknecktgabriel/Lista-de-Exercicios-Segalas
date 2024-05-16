package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.util.Scanner;

public class DadosAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int nota;
        int codAluno;


        for (int i = 1; i <= 3; i++) {
            System.out.printf("Qual o nome do aluno " + i + " ?");
            nome = scanner.next();

            System.out.print("Qual o codigo do aluno " + i + " :");
            codAluno = scanner.nextInt();

            for (int j = 0; j <=1 ; j++) {
                System.out.printf("Quais as notas do aluno " + i + " ?: ");
                nota = scanner.nextInt();
            }
        }
    }
}