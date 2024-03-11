package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 1;
        int idadeMedia = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        double salario = 1000000000;
        double menorSalario = 0;
        int idadeMenorSalario = 0;
        String generoMenorSalario = "";
        double totalSalario = 0;
        double mediaSalario = 0;
        int mulheresQueGanhamAte200 = 0;
        int contagemSalario = 0;
        char genero = 'a';

        while (idade != 0) {
            System.out.print("Por favor, informe sua idade: ");
            idade = scanner.nextInt();

            if (idade > 0 && idade < 150) {
                System.out.println("Informe seu genero com o seguinte comando, (M/F): ");
                genero = scanner.next().toLowerCase().charAt(0);

                if (genero == 'm' || genero == 'f') {
                    System.out.println("Digite seu salario: ");
                    salario = scanner.nextDouble();
                    totalSalario += salario;
                    contagemSalario++;

                    if (salario < menorSalario) {
                        menorSalario = salario;
                        idadeMenorSalario = idade;
                    }
                }
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (menorIdade < idade) {
                menorIdade = idade;
            }
            if (genero == 'f' && salario <= 200) {
                mulheresQueGanhamAte200++;
            }
        }
        System.out.println("A média do salário da população é de: " + totalSalario / contagemSalario + " reais");
        System.out.println("A maior idade dentre os analisados é: " + maiorIdade + " anos.");
        System.out.println("A menor idade dentre os analisados é: " + menorIdade + " anos.");
        System.out.println("Quantidade de mulheres que ganha até 200 reais: " + mulheresQueGanhamAte200);
        System.out.println("A pessoa com o menor salario entre os analisados tem " + idadeMenorSalario + " anos" + ", e tem o genero: " + generoMenorSalario);

    }
}

