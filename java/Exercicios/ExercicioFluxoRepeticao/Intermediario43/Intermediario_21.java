package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        String sexo = null;
        int idadeGeral = 0;
        int idadeMediaM = 0;
        int idadeMediaH = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Informe se a pessoa é homem ou mulhere através do comando H para homens e M para mulheres: ");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H")) {

                System.out.println("informe a idade: " + i + ": ");
                idade = scanner.nextInt();

            }
            if (sexo.equalsIgnoreCase("M")) {
                idadeMediaM += idade;

            } else if (sexo.equalsIgnoreCase("H")) {
                idadeMediaH += idade;
            }
            idadeGeral += idade;
        }
        System.out.println("Idade média: " + idadeGeral / 4);
        System.out.println("Idade média mulheres: " + idadeMediaM / 4);
        System.out.println("Idade média homens" + idadeMediaH / 4);

    }
}
