package POO_Praticas.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra;
        int numeroAleatorio = 0;

        try {

            System.out.printf("Infome uma palavra: ");
            palavra = scanner.next();

            System.out.printf("Agora, informe um número: ");
            numeroAleatorio = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Erro! Informe um número");
            e.printStackTrace();

        }

    }
}

