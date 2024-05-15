package Exercicios.ExercicioFluxoRepeticao.Dificil43;

import java.util.Scanner;

public class Dificil25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.printf("Informe um número: ");
        numero = scanner.nextInt();
         long fatorial = 1;
         int i =1;

         while (i <= numero){
             fatorial = fatorial * i;
             i++;
         }
        System.out.println("O fatoria de " + numero + " é: " + fatorial);
    }
}
