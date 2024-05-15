package main.java.POO.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionErroNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;


        try {
            System.out.printf("Informe o primeiro número: ");
            num1 = scanner.nextInt();

            System.out.printf("Informe o segundo número: ");
            num2 = scanner.nextInt();

            resultado = num1 / num2;

            System.out.printf("Resultado: " + resultado);


        } catch (ArithmeticException e1) {
            System.out.println("Impossível dividir por zero!");
        } catch (InputMismatchException e2) {
            System.out.println("Apenas números podem ser mencionados!");
        }
    }
}