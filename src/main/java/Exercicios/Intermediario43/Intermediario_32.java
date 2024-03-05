package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroDoCanal = null;
        int pessoasQueEstavamAssistindo = 0;
        int porcentagemDeAudiencia = 0;
        int habitantesDaCidade = 100000;
        int canal;


        for (int i = 1; i <= 4; i++) {
            System.out.printf("Informe o canal que estava sendo assistido, sendo as opções:\nCanal 4, Canal 5, Canal 7, e Canal 12: ");
            numeroDoCanal = scanner.next();

            if (numeroDoCanal.equalsIgnoreCase("4") || numeroDoCanal.equalsIgnoreCase("5") || numeroDoCanal.equalsIgnoreCase("7") || numeroDoCanal.equalsIgnoreCase("12")) {

                System.out.print("Informe o número de pessoas que estavam assistindo o canal naquele momento: ");
                pessoasQueEstavamAssistindo = scanner.nextInt();

                System.out.println();
            }
            porcentagemDeAudiencia = (pessoasQueEstavamAssistindo * 100) / habitantesDaCidade;
            System.out.println("A porcentagem de pessoas que estavam assistindo o canal " + numeroDoCanal + " é de " + porcentagemDeAudiencia + " %");
        }
        System.out.println("Digite 0 para finalizar o programa, ou digite o número de um canal para continuar...");
        canal = scanner.nextInt();
    }
}
