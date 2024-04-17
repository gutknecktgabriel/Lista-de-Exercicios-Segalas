package Exercicios.Exercicios_Logica_OO.Array;

import java.util.Scanner;

public class Exerc_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] valores = new int[5][5];

        valores[0][0] = 0;
        valores[0][1] = 15;
        valores[0][2] = 30;
        valores[0][3] = 5;
        valores[0][4] = 12;

        valores[1][0] = 15;
        valores[1][1] = 0;
        valores[1][2] = 10;
        valores[1][3] = 17;
        valores[1][4] = 28;

        valores[2][0] = 30;
        valores[2][1] = 10;
        valores[2][2] = 0;
        valores[2][3] = 3;
        valores[2][4] = 11;

        valores[3][0] = 5;
        valores[3][1] = 17;
        valores[3][2] = 3;
        valores[3][3] = 0;
        valores[3][4] = 80;

        valores[4][0] = 12;
        valores[4][1] = 28;
        valores[4][2] = 11;
        valores[4][3] = 80;
        valores[4][4] = 0;


        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print("\t\t" + valores[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Informe uma distância: ");

    }

}
