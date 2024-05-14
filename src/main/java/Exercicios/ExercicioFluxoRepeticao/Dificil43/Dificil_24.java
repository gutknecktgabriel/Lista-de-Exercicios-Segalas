package Exercicios.Dificil43;

import java.util.Scanner;

public class Dificil_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numero = 0;
        int numDivisores = 0;

        System.out.printf("Digite um número: ");
        numero = scanner.nextInt();

        for (int i = 2; i <=numero ; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)  {
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }
    }
}