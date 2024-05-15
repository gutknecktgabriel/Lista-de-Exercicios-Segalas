package Exercicios.ExercicioFluxoRepeticao.Intermediario43;

import java.util.Scanner;

public class Intermediario_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar variaveil Idade

        //Criar laço de repetição
        // Apresentar mensagens para o usuario
        // Media das idades que responderam otimo
        // Variavel media das idades que responderam otimo
        // QUANTIDADE de pessoas que responderam regular
        // Variavel que lê quantidade de pessoas que responderam regualar
        // PORCENTAGEM de pessoas que resopndeu bom entre todos

        int idade = 0;
        String opiniao;
        int MediaIdadeAvaliaçãoaOtimo = 0;
        int ContagemPessoasAvaliaçãoaRegular = 0;
        int quantidadeDeAvaliaçõesBom = 0;
        int contagemTotal = 0;
        int porcentagem = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Informe a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();

            System.out.println("Informe a opinião da pessoa " + i + " ,\n 1 = Regular,  2 = Bom e 3 = Ótimo");
            opiniao = scanner.next();

            if (opiniao.equalsIgnoreCase("1") || opiniao.equalsIgnoreCase("2") || opiniao.equalsIgnoreCase("3")) {
            }

            if (opiniao.equalsIgnoreCase("3")) {
                MediaIdadeAvaliaçãoaOtimo += idade;
                MediaIdadeAvaliaçãoaOtimo++;
            } else if (opiniao.equalsIgnoreCase("1")) {
                ContagemPessoasAvaliaçãoaRegular++;
            }
            if (opiniao.equalsIgnoreCase("2")) {
                quantidadeDeAvaliaçõesBom++;
            }
            contagemTotal++;
            porcentagem = (quantidadeDeAvaliaçõesBom * 100) / contagemTotal;
        }
        System.out.println("Média de idade das pessoas que deram uma avalição com nota Ótima do filme : " + MediaIdadeAvaliaçãoaOtimo/ 5);
        System.out.println("Quantidades de notas ruins: " + ContagemPessoasAvaliaçãoaRegular);
        System.out.println("Porcentagem de pessoas que deram uma avaliação Boa entre todas as analisadas: " + porcentagem + " %");
    }
}