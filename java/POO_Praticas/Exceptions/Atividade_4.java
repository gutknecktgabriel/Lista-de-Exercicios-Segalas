package POO_Praticas.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;
        int resultado = 0;

        try {

        System.out.printf("informe o primeiro número para efetuarmos o cálculo de divisão: ");
        num_1 = scanner.nextInt();

        System.out.printf("Agora, informe o segundo: ");
        num_2 = scanner.nextInt();

        resultado = num_1 / num_2;

        System.out.println(resultado);


        }catch (ArithmeticException e){
            System.out.println("Impossivel dividir por zero");
            e.printStackTrace();
            scanner.next();
        }
        catch (InputMismatchException e){
            System.out.println("Impossivel informar letras na divisão");

        }
        System.out.println("Fim do programa");
        scanner.close();
    }
}
