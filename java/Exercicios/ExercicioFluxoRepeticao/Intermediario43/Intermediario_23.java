package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int idadeGeral = 0;

        for (int i = 1; i <=7 ; i++) {
            System.out.printf("Informe a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();

            idadeGeral += idade;

        }

        System.out.println("A média das idades é: " + idadeGeral / 7);
        System.out.println("Idade =  0");
    }
}
