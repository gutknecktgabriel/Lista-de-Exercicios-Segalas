package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 1;
        int pessoasComMaisde50Anos = 0;
        double altura = 0;
        double somaDeAltura = 0;
        double mediaAltura = 0;

        while (idade  != 0){
            System.out.printf("Informe sua idade: ");
            idade = scanner.nextInt();

            if (idade > 0 && idade <150){
                System.out.printf("Informe sua altura: ");
                altura = scanner.nextDouble();
                somaDeAltura += altura;
            }
            if (idade > 50){
                pessoasComMaisde50Anos ++;
            }
            mediaAltura = somaDeAltura / pessoasComMaisde50Anos;
        }
        System.out.println("O total de pessoas com mais de 50 anos é de: " + pessoasComMaisde50Anos);
        System.out.println("Média de altura das pessoas que possuem mais de 50 anos: " + mediaAltura);
    }
}
