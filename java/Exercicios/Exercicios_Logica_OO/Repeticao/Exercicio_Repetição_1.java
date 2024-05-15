package Exercicios.Exercicios_Logica_OO.Repeticao;


import java.util.Scanner;

public class Exercicio_Repetição_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int numDivisores = 0;

        System.out.printf("Digite um valor para verificarmos se ele é primo: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num ; i++) {
            if (num % i ==0){
                numDivisores++;
            }
        }
        if (numDivisores == 2){
            System.out.println("O valor é primo");
        }
        else {
            System.out.println("O valor não é primo");
        }
    }
}
