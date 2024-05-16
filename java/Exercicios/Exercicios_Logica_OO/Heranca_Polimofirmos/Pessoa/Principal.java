package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Pessoa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcaoUsuario;

        System.out.println("Deseja instanciar uma pessoa ou um aluno?");
        opcaoUsuario = scanner.next().toLowerCase();

        switch (opcaoUsuario) {
            case "pessoa":

                System.out.println("Qual será o nome da pessoa?");
                String nomePessoa = scanner.next();

                System.out.println("Qual a idade da pessoa? ");
                int idade = scanner.nextInt();
                Pessoa pessoa = new Pessoa(nomePessoa, idade);
                pessoa.mostrarDados();
                break;
            case "aluno":

                System.out.println("Qual o nome do aluno?");
                String nomeAluno = scanner.next();

                System.out.println("Qual a idade do aluno?");
                int idadeAluno = scanner.nextInt();

                System.out.println("Qual o curso onde o aluno está matriculado?");
                String curso = scanner.next();

                Aluno aluno = new Aluno(nomeAluno,idadeAluno,curso);
                aluno.mostrarDados();
                break;
        }
    }
}
