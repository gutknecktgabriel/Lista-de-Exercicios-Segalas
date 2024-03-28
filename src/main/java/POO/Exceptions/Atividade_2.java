package POO.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        try {
            System.out.printf("Informe o primeiro número para realizar o cálculo de soma: ");
            num1 = scanner.nextInt();

            System.out.printf("Agora informe o segundo número: ");
            num2 = scanner.nextInt();

            resultado = num1 + num2;

            System.out.println("Resultado da soma: " + resultado);
        }
        catch (InputMismatchException e){
            System.out.println("Erro! Informe apenas números.");
        }
        System.out.println("End of program.");
    }
}
