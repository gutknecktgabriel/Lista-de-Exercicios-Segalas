package POO.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;
        int resultado = 0;

        try {

        System.out.println("informe o primeiro número para efetuarmos o cálculo de divisão");
        num_1 = scanner.nextInt();

        System.out.println("Agora, informe o segundo");
        num_2 = scanner.nextInt();

        resultado = num_1 / num_2;

        }catch (ArithmeticException e){
            System.out.println("Impossivel dividir por zero");
        }
        catch (InputMismatchException e){
            System.out.println("Impossivel informar letras na divisão");
        }
        System.out.println("Fim do programa");
        scanner.close();
    }
}
