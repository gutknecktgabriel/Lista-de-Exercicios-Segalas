package Exercicios.Exercicios_Logica_OO.Array;

import java.util.Scanner;

public class Exerci_10_Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArrayList = 0;
        int valor = 0;

        System.out.printf("Qual o tamanho do array que você deseja criar? ");
        tamanhoArrayList = scanner.nextInt();
        Exerc_10 test = new Exerc_10(tamanhoArrayList);


        for (int i = 0; i < tamanhoArrayList; i++) {
            System.out.printf("Digite os valores para calcularmos a média: ");
            valor = scanner.nextInt();

            if (!test.adicionar(valor)) {
                System.out.println("Tamanho máximo atingido!");
                break;
            }

        }
        System.out.println("Média dos valores: " + test.calculoMedia());
    }
}
