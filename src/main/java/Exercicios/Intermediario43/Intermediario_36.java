package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char acao_1 = 'A';
        char acao_2 = 'B';
        char acao_3 = 'C';
        double acaoDeCompra_1 = 0;
        double acaoDeCompra_2 = 0;
        double acaoDeCompra_3 = 0;
        double valorDeVenda_1 = 0;
        double valorDeVenda_2 = 0;
        double valorDeVenda_3 = 0;
        double lucro_acao1 = 0;
        double lucro_acao2 = 0;
        double lucro_acao3 = 0;
        int totalAcoesMilReais = 0;
        int totalAcoesInferior200 = 0;
        Scanner acao ;
        double totalLucroEmpresa = 0;


        for (int i = 1; i == 1; i++) {
            System.out.printf("Informe o valor de compra da ação " + acao_1 + ": ");
            acaoDeCompra_1 = scanner.nextDouble();

            System.out.printf("Informe o valor de compra da ação " + acao_2 + ": ");
            acaoDeCompra_2 = scanner.nextDouble();

            System.out.printf("Informe o valor de compra da ação " + acao_3 + ": ");
            acaoDeCompra_3 = scanner.nextDouble();

            System.out.println("Agora, informe o valor de venda de cada ação");

            System.out.println("Informe o valor de venda da ação " + acao_1 + ": ");
            valorDeVenda_1 = scanner.nextInt();

            System.out.println("Informe o valor de venda da ação " + acao_2 + ": ");
            valorDeVenda_2 = scanner.nextInt();

            System.out.println("Informe o valor de venda da ação " + acao_3 + ": ");
            valorDeVenda_3 = scanner.nextInt();

            lucro_acao1 = valorDeVenda_1 - acaoDeCompra_1;
            lucro_acao2 = valorDeVenda_2 - acaoDeCompra_2;
            lucro_acao3 = valorDeVenda_3 - acaoDeCompra_3;

            if (lucro_acao1 > 1000){
                totalAcoesMilReais++;
            }
            if (lucro_acao2 > 1000){
                totalAcoesMilReais++;
            }
            else if (lucro_acao3 < 1000){
                totalAcoesMilReais++;
            }
            if (lucro_acao1 < 200){
                totalAcoesInferior200++;
            }
            if (lucro_acao2 < 200){
                totalAcoesInferior200++;
            }
            if (lucro_acao3 < 200){
                totalAcoesInferior200++;
            }
            totalLucroEmpresa += lucro_acao1;
            totalLucroEmpresa += lucro_acao2;
            totalLucroEmpresa += lucro_acao3;

            break;
        }
        System.out.println("Lucro obtido pela venda da ação " + acao_1 + " foi de: " + lucro_acao1 + " reais.");
        System.out.println("Lucro obtido pela venda da ação " + acao_2 + " foi de: " + lucro_acao2 + " reais.");
        System.out.println("Lucro obtido pela venda da ação " + acao_3 + " foi de: " + lucro_acao3 + " reais.");
        System.out.println("Total de ações com lucro superior a mil reais: "+ totalAcoesMilReais);
        System.out.println("Total de ações com lucro inferior a 200 reais: " + totalAcoesInferior200);
        System.out.println("O lucro total da empresa foi de " + totalLucroEmpresa + " reais.");

    }

}

