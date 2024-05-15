package Exercicios.ExercicioFluxoRepeticao.Dificil43;

import java.util.Scanner;

public class Dificil_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota_1 = 0;
        double nota_2 = 0;
        int num_3 = 0;
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double peso_1 = 0;
        double peso_2 = 0;
        double peso_3 = 0;
        double resultadoMediaAritmetica = 0;
        double total = 0;
        double resultadoMediaPonderada = 0;


        System.out.printf("Informe a opção que você deseja\n01 Média Aritmética, 02 Média Ponderada e 3 Sair: ");
        num_3 = scanner.nextInt();
        if (num_3 < 4 && num_3 > 0) {
            switch (num_3) {
                case 1:
                    System.out.printf("Informe a primeira nota: ");
                    nota_1 = scanner.nextDouble();
                    total += nota_1;

                    System.out.printf("Informe a segunda nota: ");
                    nota_2 = scanner.nextDouble();
                    total += nota_2;

                    System.out.println("O resultado da média arimética entre as duas nota é: " + (total / 2));
                    break;
                case 2:
                    System.out.println("Informe a primeira nota para calcular a média ponderada: ");
                    n1 = scanner.nextDouble();

                    System.out.println("Informe a primeira segunda para calcular a média ponderada: ");
                    n2 = scanner.nextDouble();

                    System.out.println("Informe a primeira terceira para calcular a média ponderada: ");
                    n3 = scanner.nextDouble();

                    System.out.println("Informe o primeiro peso para calcular a média ponderada: ");
                    peso_1 = scanner.nextDouble();

                    System.out.println("Informe o segundo peso para calcular a média ponderada: ");
                    peso_2 = scanner.nextDouble();

                    System.out.println("Informe o terceiro peso para calcular a média ponderada: ");
                    peso_3 = scanner.nextDouble();

                    System.out.println("O resultado da média ponderada é: " + (resultadoMediaPonderada = (n1 * peso_1 + n2 * peso_2 + n3 * peso_3) / (peso_1 + peso_2 + peso_3)));
                    break;

                case 3:
                    System.out.println("Saindo do programa... ");
                    break;
            }
        } else {
            System.out.println("COMANDO INVÁLIDO!");
        }
    }
}
