package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 Criar variaveis peso, idade
        //2 Receber peso e idade
        //4 Criar faixa etarias de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 31 anos.
        //5 criar variaveis da cada faixa etaria??

        int idade = 0;
        double peso = 0;
        double MediadePesoEntre1e10anos = 0;
        double MediadePesoEntre11a20 = 0;
        double MediadePesoEntre21a30 = 0;
        double MediaPesoMaisque31 = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.printf("Informe a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();

            System.out.printf("Informe o peso da pessoa " + i + ": ");
            peso = scanner.nextDouble();

            if (idade >= 1 && idade <= 10) {
                MediadePesoEntre1e10anos += peso;
            } else if (idade >= 11 && idade <= 20) {
                MediadePesoEntre11a20 += peso;
            }
            if (idade >= 21 && idade <= 30) {
                MediadePesoEntre21a30 += peso;
            }
            else if (idade >= 31) {
                MediaPesoMaisque31 += peso;
            }
        }
        System.out.println("Media de peso entre 1 e 10 anos de idade: " + MediadePesoEntre1e10anos / 7);
        System.out.println("Media de peso entre 11 e 20 anos de idade: " + MediadePesoEntre11a20 / 7);
        System.out.println("Media de peso entre 21 e 30 anos de idade: " + MediadePesoEntre21a30 / 7);
        System.out.println("Media de peso entre maiores de 31  anos: " + MediaPesoMaisque31 / 7);

    }
}
