package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero_1 = 0;
        double numero_2 = 0;
        int num_3 = 0;
        double resultado = 0;

        System.out.printf("Digite o primeiro número: ");
        numero_1 = scanner.nextDouble();

        System.out.printf("Digite o segundo número: ");
        numero_2 = scanner.nextDouble();

        System.out.println("Escolha o tipo do cálculo\n 01 Somar, 02 Subtrair, 03 Multiplicar e 04 Divisão");
        num_3 = scanner.nextInt();
        if (num_3 < 5 && num_3 > 0) {
            switch (num_3) {
                case 1:
                    resultado = numero_1 + numero_2;
                    break;
                case 2:
                    resultado = numero_1 - numero_2;
                    break;
                case 3:
                    resultado = numero_1 * numero_2;
                    break;
                case 4:
                    resultado = numero_1 / numero_2;
            }
            System.out.println("Resultado igual a: " + resultado);
        }
    }
}
