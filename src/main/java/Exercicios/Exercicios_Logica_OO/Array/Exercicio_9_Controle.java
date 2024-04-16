package Exercicios.Exercicios_Logica_OO.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_9_Controle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 0;
        int valor = 0;

        System.out.printf("Qual o tamanho do array que você deseja criar?");
        tamanhoArray = scanner.nextInt();
        Exercicio_9_Array test = new Exercicio_9_Array(tamanhoArray);


        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o valor para calcularmos a média: " );
            valor = scanner.nextInt();

            if (!test.adicionar(valor)) {
                System.out.println("Tamanho máximo atingido!");
                break;
            }
        }
        System.out.println("Média dos valores: " + test.calculoMedia());
    }
}

