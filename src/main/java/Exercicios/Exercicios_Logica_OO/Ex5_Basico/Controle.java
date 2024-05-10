package Exercicios.Exercicios_Logica_OO.Ex5_Basico;


import java.util.ArrayList;
import java.util.Scanner;


public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do aluno ou 'fim' para sair do programa");
            String nome = scanner.nextLine();

            if (nome.equals("fim")) {
                break;
            }
        }
    }
}
