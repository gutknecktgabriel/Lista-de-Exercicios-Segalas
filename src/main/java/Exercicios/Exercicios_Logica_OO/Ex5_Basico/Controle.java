package Exercicios.Exercicios_Logica_OO.Ex5_Basico;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int somaNotaAlunos;
        int alunosReprovados = 0;
        int divisaoParaMedia = 0;
        int alunosAprovados = 0;
        int qntNotas = 0;


        Aluno aluno = new Aluno();

        while (true) {
            alunos.add(aluno);

            System.out.println("Informe o nome do aluno ou digite 'fim' para encerrar o programa.");
            aluno.setNomeAluno(scanner.next());

            if (aluno.getNomeAluno().equalsIgnoreCase("Fim")) {
                break;
            }

            System.out.println("Digite a primeira nota do aluno: ");
            aluno.setPrimeiraNotaParcial(scanner.nextInt());
            qntNotas++;

            System.out.println("Digite a segunda nota do aluno: ");
            aluno.setSegundaNotaParcial(scanner.nextInt());
            qntNotas++;


            somaNotaAlunos = aluno.getPrimeiraNotaParcial() + aluno.getSegundaNotaParcial();
            divisaoParaMedia = somaNotaAlunos / qntNotas;

            if (divisaoParaMedia < 60){
                alunosReprovados++;
            }
            else {
                alunosAprovados++;
            }

        }
        System.out.println("Media da turma: " + divisaoParaMedia);
        System.out.println("Alunos reprovados: " + alunosReprovados);
        System.out.println("Alunos aprovados: " + alunosAprovados);
    }
}
