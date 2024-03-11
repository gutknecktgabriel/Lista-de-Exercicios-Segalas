package Exercicios.Dificil43;

import java.util.Scanner;

public class Dificil_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDoCarro = 0;
        double valorFinalCarro = 0;
        double valorFinalCarroComDesconto = 0;
        int parcelas = 0;
        double aVista = 0;
        double desconto = 0;

        System.out.printf("Informe o valor do carro: ");
        valorDoCarro = scanner.nextDouble();

        System.out.printf("Informe em quantas parcelas você deseja pagar\n 6 , 12 , 18 , 24 , 30 , 36, 42, 48, 54 e 60. ");
        parcelas = scanner.nextInt();
        if (parcelas >= 6 && parcelas <= 60) {
            switch (parcelas) {
                case 6:
                    valorFinalCarro = valorDoCarro * 1.03;
                    break;
                case 12:
                    valorFinalCarro = valorDoCarro * 1.06;
                    break;
                case 18:
                    valorFinalCarro = valorDoCarro * 1.09;
                    break;
                case 24:
                    valorFinalCarro = valorDoCarro * 1.12;
                    break;
                case 30:
                    valorFinalCarro = valorDoCarro * 1.15;
                    break;
                case 36:
                    valorFinalCarro = valorDoCarro * 1.18;
                    break;
                case 42:
                    valorFinalCarro = valorDoCarro * 1.21;
                    break;
                case 48:
                    valorFinalCarro = valorDoCarro * 1.24;
                    break;
                case 54:
                    valorFinalCarro = valorDoCarro * 1.27;
                    break;
                case 60:
                    valorFinalCarro = valorDoCarro * 1.30;
                    break;
            }
            desconto = valorDoCarro *(0.20);

            valorFinalCarroComDesconto = valorDoCarro - desconto;
        }
        System.out.println("Valor final do carro na quantidade de " + parcelas + " parcelas, ficou no valor de: " + valorFinalCarro + " reais");
        System.out.println("O valor do carro a vista ficaria no valor de: " + valorFinalCarroComDesconto);
    }
}
