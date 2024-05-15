package Exercicios.Exercicios_Logica_OO.Exeções;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Exerc_13 {

    public static void main(String[] args) throws ValorBaixoException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean acertou = false;
        int tentativas = 0;
        int numeroSecreto = random.nextInt(1000);
        long chute = 0;


        while (!acertou) {

            System.out.println("Qual seu chute? ");
            chute = scanner.nextLong();

            if (numeroSecreto == chute) {
                System.out.println("Você acertou! número de tentativas: " + tentativas);
                acertou = true;
                try {
                    if (chute < numeroSecreto) {
                        tentativas++;
                    }
                } catch (ValorBaixoException e) {
                    e.getMessage();
                }
                try {
                     if(chute > numeroSecreto){
                        tentativas++;
                    }
                }catch (ValorAltoException e){
                    e.getMessage();
                }
            }
        }
    }
}




