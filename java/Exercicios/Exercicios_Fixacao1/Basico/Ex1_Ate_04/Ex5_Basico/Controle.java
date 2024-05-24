package Exercicios.Exercicios_Logica_OO.Basico.Ex1_Ate_04.Ex5_Basico;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaNotaAlunos = 0;
        int alunosReprovados = 0;
        int mediaAlunos = 0;
        int alunosAprovados = 0;
        int alunosFinal = 0;
        int codigoAluno = 0;
        int qntAlunos = 0;

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Integer> codigoAlunosReprovados = new ArrayList<>();


        while (true) {
            Aluno aluno = new Aluno();
            System.out.println("Informe o nome do aluno ou digite 'fim' para encerrar o programa.");
            aluno.setNomeAluno(scanner.next());

            if (aluno.getNomeAluno().equalsIgnoreCase("Fim")) {
                break;
            }

            System.out.println("Informe o codigo do aluno: ");
            codigoAluno = scanner.nextInt();

            System.out.println("Digite a primeira nota do aluno: ");
            aluno.setPrimeiraNotaParcial(scanner.nextInt());

            if (aluno.getPrimeiraNotaParcial() > 100) {
                System.out.println("A nota máxima para cada aluno é 100!");
            }

            System.out.println("Digite a segunda nota do aluno: ");
            aluno.setSegundaNotaParcial(scanner.nextInt());


            if (aluno.getSegundaNotaParcial() > 100) {
                System.out.println("A nota máxima para cada aluno é 100!");
            }

            somaNotaAlunos = aluno.getPrimeiraNotaParcial() + aluno.getSegundaNotaParcial();
            mediaAlunos = somaNotaAlunos / 2;

            if (mediaAlunos < 60) {
                alunosReprovados++;
                codigoAlunosReprovados.add(codigoAluno);
            }
            if (mediaAlunos >95){
                alunosFinal++;
            }
            else {
                alunosAprovados++;
            }
            if (mediaAlunos < 60){
                alunosReprovados = codigoAluno;
            }
            alunos.add(aluno);
            qntAlunos++;
        }
        double mediaTurma = 0;
        for (Aluno aluno : alunos) {
            mediaTurma += (aluno.getPrimeiraNotaParcial() + aluno.getSegundaNotaParcial()) / 2;

        }
        mediaTurma /= alunos.size();


        System.out.println("Media da turma: " + mediaTurma);
        System.out.println("Alunos aprovados: " + alunosAprovados);
        System.out.println("Quantidade de alunos reprovados: " + alunosReprovados + " , código dos alunos reprovados: " + codigoAlunosReprovados);
        System.out.println("Quantidade de alunos que foram para a final dentre todos: " + alunosFinal);
    }
}
