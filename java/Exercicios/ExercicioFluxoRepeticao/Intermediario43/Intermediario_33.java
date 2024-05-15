package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 0;
        double mediaSalarial = 0;
        double maiorSalario = 0;
        int filhos = 0;
        int mediaDeFilhos = 0;
        double salarioAte150 = 0;
        double porcentagem = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.printf("Informe o seu salário, habitante analisado " + i + ": ");
            salario = scanner.nextDouble();


            System.out.printf("Informe a quantidade de filhos que você possui, habitante analisado " + i + ": ");
            filhos = scanner.nextInt();

            mediaSalarial += salario;
            mediaDeFilhos += filhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            } else if (maiorSalario < salario) {
                salario = maiorSalario;
            }
            if (salario <= 150){
                salarioAte150++;
            }
        }
        porcentagem = (salarioAte150 * 100) / 2;
        System.out.println("Media salarial: " + mediaSalarial / 2);
        System.out.println("Media de filhos: " + mediaDeFilhos / 2);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Porcentagem de pessoas que recebem até 150 reais: " + porcentagem + " %");
    }
}