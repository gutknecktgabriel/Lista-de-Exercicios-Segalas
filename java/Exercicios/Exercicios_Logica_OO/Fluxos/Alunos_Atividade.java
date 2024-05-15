package Exercicios.Exercicios_Logica_OO.Fluxos;


import java.io.*;
import java.util.Scanner;

public class Alunos_Atividade {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        try {
            DataOutputStream stream = new DataOutputStream(new FileOutputStream("c:\\temp\\DadosAlunos.txt"));

            int contador = 0;
            int somaNotas = 0;
            int numAlunos = 3;

            for (int i = 0; i < numAlunos; i++) {
                System.out.println("Informe o nome do aluno: ");
                String nomeAlunos = scanner.next();

                System.out.println("Informe a primeira nota do aluno: ");
                int nota_1 = scanner.nextInt();

                System.out.println("Informe a segunda nota do aluno: ");
                int nota_2 = scanner.nextInt();

                System.out.println("Informe o código do aluno: ");
                String codigoAlunos = scanner.next();

                stream.writeUTF(nomeAlunos);
                stream.writeInt(nota_1);
                stream.writeInt(nota_2);
                stream.writeUTF(codigoAlunos);

                contador++;
                somaNotas += nota_1 + nota_2;
            }

            double mediaTurma = (double) somaNotas / (numAlunos * 2);
            int notaMinima = 6;
            int alunosReprovados = 0;
            DataInputStream inputStream = new DataInputStream(new FileInputStream("c:\\temp\\DadosAlunos.txt"));
            for (int i = 0; i < numAlunos; i++) {
                String nomeAluno = inputStream.readUTF();
                int nota1 = inputStream.readInt();
                int nota2 = inputStream.readInt();
                String codigo = inputStream.readUTF();
                double media = (nota1 + nota2) / 2.0;
                if (media < notaMinima) {
                    alunosReprovados++;
                    System.out.println(nomeAluno + " está reprovado com média " + media);
                }
            }
            System.out.println("Média da turma: " + mediaTurma);
            System.out.println("Número de alunos reprovados: " + alunosReprovados);

            stream.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Erro ao adicionar notas" + e.getMessage());
        }


        System.out.println("-------------Leitura do Arquivo----------------");
        File file = new File("c:\\temp\\DadosAlunos.txt");
        Scanner scanner1 = new Scanner(file);

        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
    }
}
