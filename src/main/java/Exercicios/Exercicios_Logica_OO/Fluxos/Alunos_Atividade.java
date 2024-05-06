package Exercicios.Exercicios_Logica_OO.Fluxos;


import java.io.*;
import java.util.Scanner;

public class Alunos_Atividade {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        try {
            DataOutputStream stream = new DataOutputStream(new FileOutputStream("c:\\temp\\DadosAlunos.txt"));

            for (int i = 0; i <= 2; i++) {
                System.out.println("Informe o nome do aluno: ");
                String nomeAlunos = null;
                nomeAlunos = scanner.next();
                String tamanho = String.valueOf(nomeAlunos.length());


                System.out.println("Informe as notas do aluno");
                String nota_1 = scanner.next();
                String nota_2 = scanner.next();

                System.out.println("Informe o codigo do aluno: ");
                String codigoAlunos;


                codigoAlunos = scanner.next();

                stream.write(nomeAlunos.getBytes());
                stream.write(tamanho.getBytes());

                stream.write(nota_1.getBytes());
                stream.write(nota_2.getBytes());

                stream.write(codigoAlunos.getBytes());

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File file = new File("c:\\temp\\DadosAlunos.txt");
        Scanner scanner1 = new Scanner(file);

        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());

            int media = 0;
            int reprovados = 0;

            if (nota_1)
        }
    }
}

