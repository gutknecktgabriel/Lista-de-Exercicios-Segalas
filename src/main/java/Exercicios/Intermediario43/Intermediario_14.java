package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLinha = 5;

        for (int i = 1; i <= numeroLinha ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
