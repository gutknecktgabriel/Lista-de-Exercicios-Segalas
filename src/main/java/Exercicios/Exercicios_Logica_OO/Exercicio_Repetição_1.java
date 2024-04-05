package Exercicios.Exercicios_Logica_OO;

import java.util.Scanner;

public class Exercicio_Repetição_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int cont = 0;

        System.out.println("Digite um número para verificarmos se o mesmo é primo: ");
        num = scanner.nextInt();

        for (int i = 1; i <num ; i++) {
            if (num % i == 0){
                cont++;
            }
        }
        if (cont == 2){
            System.out.println("O número " + num + " não é primo");
        }
        else {
            System.out.println("O número " + num + " é primo");
        }
    }
}
