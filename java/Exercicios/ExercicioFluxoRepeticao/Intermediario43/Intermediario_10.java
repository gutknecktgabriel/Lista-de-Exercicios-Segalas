package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int pessoasCom15 = 0;
        int pessoasCom30 = 0;
        int pessoasCom45 = 0;
        int pessoasCom60 = 0;
        int acimaDe61 = 0;
        double porcentagem = 0;
        int somaIdade = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe a idade: ");
            idade = scanner.nextInt();

            if (idade <= 15) {
                pessoasCom15++;
            } else if (idade >= 16 && idade <= 30) {
                pessoasCom30++;
            }
            if (idade >= 31 && idade <= 45) {
                pessoasCom45++;
            } else if (idade >= 46 && idade <= 60) {
                pessoasCom60++;
            }
            if (idade > 60) {
                acimaDe61++;
            }
        }
        System.out.println("Pessoas até 15 anos: " + pessoasCom15);
        System.out.println("Pessoas de 16 a 30 anos: " + pessoasCom30);
        System.out.println("Pessoas de 31 a 45 anos: " + pessoasCom45);
        System.out.println("Pessoas de 46 a 60 anos: " + pessoasCom60);
        System.out.println("Pessoas acima de 61 anos: " + acimaDe61);

        somaIdade = pessoasCom15 + acimaDe61;
        porcentagem = somaIdade * 100 / 5;
        System.out.println("A porcentagem de pessoas que tem até 15 anos e acima de 61 é: " + porcentagem);

    }
}

