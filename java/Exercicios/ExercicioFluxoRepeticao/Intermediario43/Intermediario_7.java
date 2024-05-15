package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_7 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    //criar variaveis de valor de compra, porcentagem de desconto e valor final
    //criar if falando que compras maior ou igual a 600 ganha 1% de desconto
    //criar if falando que a cada 100 reais, a porcentagem aumenta 1%

        double valorCompra = 0;
        double porcentagemDesconto = 0;
        double valorFinal = 0;

        System.out.print("Informe o valor da sua compra: ");
        valorCompra = scanner.nextDouble();

        if (valorCompra > 500) {
            porcentagemDesconto = ((valorCompra - 500) / 100);
            if (porcentagemDesconto > 25) {
                porcentagemDesconto = 25;
            }
        }
        valorFinal = valorCompra - (valorCompra * (porcentagemDesconto / 100));
        System.out.println(porcentagemDesconto);
        System.out.println("O valor final da sua compra é: " + valorFinal);
    }
}
