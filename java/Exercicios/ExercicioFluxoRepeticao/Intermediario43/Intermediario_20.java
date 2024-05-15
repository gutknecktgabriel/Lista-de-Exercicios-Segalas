package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        double peso = 0;
        double altura = 0;
        int totalIdade = 0;
        int pesoeAltura = 0;
        int porcentagemidadeEAltura = 0;

        for (int i = 1; i <=3 ; i++) {
            System.out.printf("Informe a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();


            System.out.printf("Informe o peso da pessoa " + i + ": ");
            peso = scanner.nextDouble();

            System.out.printf("Informe a altura da pessoa " + i + ": ");
            altura = scanner.nextDouble();

            if (peso > 90 && altura <1.50){
                pesoeAltura++;
            } else if (idade >=10 && idade <=30 && altura > 1.90) {
                porcentagemidadeEAltura++;
            }
            totalIdade += idade;
        }
        System.out.println("A média da idade das pessoas é: " + totalIdade / 3);

        System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50: " + pesoeAltura);

        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas com mais de 1,90: " + porcentagemidadeEAltura * 3 / 100 + "%");

    }
}
