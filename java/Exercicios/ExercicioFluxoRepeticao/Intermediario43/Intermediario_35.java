package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoProduto = 0;
        double precoAntigoDoProduto = 0;
        double novoPreco = 0;
        int contador = 0;
        String produto = null;
        double mediaDosPrecosAntigos = 0;
        int contadorPrecoAntigoProduto = 0;
        double porcentagemDeAumento = 20.0 / 100.0;
        double mediaPrecoNovoProduto = 0;
        int totalPrecoAntigo = 0;
        int totalPrecoNovo = 0;

        //primeiro ler o codigo e o preço de cada produto e depois o preço nobo, depois media dos preços com e sem aumento

        while (codigoProduto >= 0) {
            System.out.printf("Informe o código do produto: ");
            codigoProduto = scanner.nextInt();
            if (codigoProduto < 0) {
                break;
            }
            System.out.printf("Informe o preço do produto: ");
            precoAntigoDoProduto = scanner.nextDouble();
            totalPrecoAntigo += precoAntigoDoProduto;

            novoPreco = precoAntigoDoProduto + (porcentagemDeAumento * precoAntigoDoProduto);
            System.out.println("O novo preço do produto " + codigoProduto + " com acréscimo de 20% é: " + novoPreco + " reais");
            totalPrecoNovo += novoPreco;

            contador++;
            mediaDosPrecosAntigos = totalPrecoAntigo / contador;
            mediaPrecoNovoProduto = totalPrecoNovo / contador;
        }
        System.out.println("Media dos preços sem o aumento de 20%: " + mediaDosPrecosAntigos);
        System.out.println("Media dos preços com o aumento de 20%: " + mediaPrecoNovoProduto);
        System.out.println("Programa encerrado.");
    }
}
