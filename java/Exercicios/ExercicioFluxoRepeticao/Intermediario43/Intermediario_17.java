package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        int idade = 0;
        int peso90 = 0;
        int totalIdade = 0;

        for (int i = 1; i <=7 ; i++) {
            System.out.println("Informe o peso da pessoa " + i + ": ");
            peso = scanner.nextDouble();

            System.out.println("Informe a idade da pessoa " + i + ":");
            idade = scanner.nextInt();

            if (peso >= 90){
                peso90++;
            }
            totalIdade += idade;
        }
        System.out.print("Quantidade de pessoas com mais de 90kg: " + peso);
        System.out.print("Média de idade: " + (totalIdade / 7 ));
    }
}
