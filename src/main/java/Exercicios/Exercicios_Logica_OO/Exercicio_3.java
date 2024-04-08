package Exercicios.Exercicios_Logica_OO;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.printf("Informe o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.printf("Informe o segundo valor: ");
        num2 = scanner.nextInt();

        if (num1 < 0 && num2 < 0) {
            System.out.println("Favor informar apenas números positivos");
            scanner.close();
        }

    }
}
