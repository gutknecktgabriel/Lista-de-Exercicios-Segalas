package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeLinha = 5;

        for (int i = 1; i <= quantidadeLinha; i++) {
            for (int j = 0; j <= quantidadeLinha; j++) {
                System.out.print("*");
                System.out.println("****" + "     " + "    ");
                System.out.println("*****" + "    " + "    ");
                System.out.println("*****" + "    " + "    ");
                System.out.println("*    *");
            }
            System.out.println("");
        }
    }
}

