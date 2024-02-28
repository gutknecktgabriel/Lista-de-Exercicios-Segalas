package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoTransacao;
        double valorTransacao = 0;
        double totalVista = 0;
        double totalPrazo = 0;
        double totalGeral = 0;

        for (int i = 1; i <= 2; i++) {

            System.out.println("Informe o tipo da transação\nV para compras a vista e P para compras a prazo: ");
            tipoTransacao = scanner.next();

            if (tipoTransacao.equalsIgnoreCase("V") || tipoTransacao.equalsIgnoreCase("P")) {

                System.out.println("Informe o valor da compra: ");
                valorTransacao = scanner.nextDouble();

            } else {
                System.out.println("Codigo invalido!");
            }
            if (tipoTransacao.equalsIgnoreCase("V")) {
                totalVista += valorTransacao;
            }
            else if (tipoTransacao.equalsIgnoreCase("P")) {
                totalPrazo += valorTransacao;
            }
             totalGeral += valorTransacao;
        }
        System.out.println("Valor das compras a vista: " + totalVista);
        System.out.println("Valor total das compras a prazo: " + totalPrazo);
        System.out.println("Total de todas as compras efetuadas: " + totalGeral);
        System.out.println("Valor da primeira parcela das compras: " + totalPrazo / 3);
    }
}









