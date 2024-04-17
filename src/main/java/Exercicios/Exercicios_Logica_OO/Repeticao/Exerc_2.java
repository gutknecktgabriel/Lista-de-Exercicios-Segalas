package Exercicios.Exercicios_Logica_OO.Repeticao;

import java.util.Random;
import java.util.Scanner;

public class Exerc_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        boolean acertou = false;
        int tentativas = 1000;
        int numeroSecreto = random.nextInt(1000);
        long chute = 0;

        while (tentativas > 0 && acertou == false) {

            System.out.println("Qual seu chute? ");
            chute = scanner.nextLong();
            if (numeroSecreto == chute) {
                System.out.println("------------------Você acertou-----------------------!!!");
                acertou = true;
            } else if (chute < numeroSecreto) {
                System.out.println("Valor baixo demais, tente um valor maior.");
            } else {
                System.out.println("Valor muito alto, tente um valor menor.");
            }
        }
    }
}

