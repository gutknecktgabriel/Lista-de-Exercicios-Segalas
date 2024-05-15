package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int totalIdade = 0;
        int idadeInferiorA35 = 0;
        int porcentagemNumerosEntre50e100 = 0;
        int contagemNumerosEntre50e100 = 0;
        int contagemNumerosEntrer10e20EntreNumMenoresQue50 = 0;
        int porcentagemNumerosEntrer10e20EntreNumMenoresQue50 = 0;
        int contagemTotal = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("Informe a idade " + i + ": ");
            idade = scanner.nextInt();
            totalIdade += idade;

            if (idade < 35){
                idadeInferiorA35++;
            }
            if (idade >= 50 && idade <=100){
                contagemNumerosEntre50e100++;
            }
            if (idade < 50 && idade >=10 && idade <=20){
                contagemNumerosEntrer10e20EntreNumMenoresQue50++;
            }
            contagemTotal ++;
            porcentagemNumerosEntre50e100 = (contagemNumerosEntre50e100 * 100) / contagemTotal;
            porcentagemNumerosEntrer10e20EntreNumMenoresQue50 = (contagemNumerosEntrer10e20EntreNumMenoresQue50 * 100) / contagemTotal;
        }
        System.out.println("Total de idades inferiores a 35 anos: " + idadeInferiorA35);
        System.out.println("Média das idades analisadas: " + totalIdade / 10 + " anos");
        System.out.println("Porcentagem de pessoas com idade entre 50 e 100: " + porcentagemNumerosEntre50e100 + "%");
        System.out.println("A porcentagem de idades entre 10 e 20 anos entre os menores que 50: " + porcentagemNumerosEntrer10e20EntreNumMenoresQue50 + "%");
    }
}
