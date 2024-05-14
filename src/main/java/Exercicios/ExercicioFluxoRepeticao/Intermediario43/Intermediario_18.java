package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variaveis idade, peso, altura.
        //Equals para perguntar a cor dos olhos
        //Equals para perguntar cor dos cabelos
        //If pessoas com idade superior a 50 anos e inferior a 60 kg
        //Variavel para receber o if acima


        int idade = 0;
        double peso = 0;
        double altura = 0;
        String cordosOlhos = null;
        String cordosCabelos;
        int contagemPesoeIdade = 0;
        int idadeTotal = 0;
        int contagemAlturaMenorQue150 = 0;
        int contagemOlhoAzul = 0;
        int ruivaSemOlhoAzul = 0;
        int  resultadoSomaOlhoAzul = 0;
        int contagemTotal = 0;
        double porcentagem = 0;


        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe a idade da pessoa " + i + ":");
            idade = scanner.nextInt();

            System.out.print("Informe o peso da pessoa " + i + ":");
            peso = scanner.nextDouble();

            System.out.print("Informe a altura da pessoa " + i + ":");
            altura = scanner.nextDouble();

            System.out.println("Informe a cor dos olhos através dos seguintes comandos \n A = Azul, P = Preto, V = Verde e C = Castanho");
            cordosOlhos = scanner.next();

            System.out.println("Agora, informe a cor dos cabelos através dos seguintes comandos \n P = Preto, C = Castanho, L = Louro e R = Ruivo");
            cordosCabelos = scanner.next();

            if (idade > 50 && peso < 60){
                contagemPesoeIdade++;
            }
            if (altura <1.50) {
                idadeTotal += idade;
                contagemAlturaMenorQue150++;
            }
            if (cordosOlhos.equalsIgnoreCase("A")) {
                    contagemOlhoAzul++;
            }
            else if (cordosCabelos.equalsIgnoreCase("R")  && !cordosOlhos.equalsIgnoreCase("A")) {
                ruivaSemOlhoAzul++;
            }
            contagemTotal++;
             porcentagem = (contagemOlhoAzul * 100) / contagemTotal;
        }
        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + contagemPesoeIdade);

        System.out.println("A média das idades das pessoas com altura inferior a 1,50: " + idadeTotal / contagemAlturaMenorQue150);

        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis" + ruivaSemOlhoAzul);

        System.out.println("Porcentagem de pessoas com olhos azuis entre as pessoas analisadas: " + porcentagem + "%");

    }
}




