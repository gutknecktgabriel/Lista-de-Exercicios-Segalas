package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLinhas = 5;

        for (int i = 1; i <=numeroLinhas ; i++) {
            for (int j=0; j<=numeroLinhas; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
