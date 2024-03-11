package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros = 0;
        int positivos = 0;
        int negativos = 0;
        int contagemTotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Informe o valor " + i + ":");
            numeros = scanner.nextInt();

            if (numeros > 0) {
                positivos = positivos + numeros++;
            } else if (numeros < 0) {
                negativos = negativos + numeros;
            }
            else if (numeros <=0 && numeros >= 0){
                contagemTotal = positivos + negativos;
            }
        }
        System.out.println("A soma dos números positivos é: " + positivos);
        System.out.println("A soma dos números negativos é: " + negativos);
        System.out.println("A soma de todos os números é: " + contagemTotal);
    }
}
