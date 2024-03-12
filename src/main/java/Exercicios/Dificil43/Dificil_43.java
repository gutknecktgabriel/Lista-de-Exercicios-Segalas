package Exercicios.Dificil43;

import java.util.Scanner;

public class Dificil_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 0;
        double resultadoNovoSalario = 0;
        double divisaoDeSalarioParaFerias = 0;
        int mesesTrabalhados = 0;
        int num = 0;

        System.out.printf("Menu de opções:\n01 Novo Salário, 02 Férias, 03 Décimo Terceiro e 4 para Sair: ");
        num = scanner.nextInt();
        if (num > 0 && num < 5) {
            switch (num) {
                case 1:
                    System.out.printf("Informe seu salário atual para realizarmos o cálculo do seu aumento salarial: ");
                    salario = scanner.nextDouble();

                    if (salario <= 350) {
                        resultadoNovoSalario += salario;
                        resultadoNovoSalario = (salario * 1.15);
                        System.out.println("Seu salário líquido com acréscimo de 15% passou a ser: " + resultadoNovoSalario);
                    } else if (salario >= 350 && salario <= 600) {
                        resultadoNovoSalario += salario;
                        resultadoNovoSalario = (salario * 1.10);
                        System.out.println("Seu salário líquido com acréscimo de 10% passou a ser: " + resultadoNovoSalario);
                    } else if (salario > 600) {
                        resultadoNovoSalario += salario;
                        resultadoNovoSalario = (salario * 1.05);
                        System.out.println("Seu salário líquido com acréscimo de 5% passou a ser: " + resultadoNovoSalario);
                        break;
                    }
                case 2:
                    System.out.printf("Informe seu salário líquido para realizarmos o cálculo das suas férias: ");
                    salario = scanner.nextDouble();

                    divisaoDeSalarioParaFerias += salario;

                    divisaoDeSalarioParaFerias = (salario / 3);

                    divisaoDeSalarioParaFerias = divisaoDeSalarioParaFerias + salario;
                    System.out.println("O valor das suas férias será de: " + divisaoDeSalarioParaFerias);
                    break;
                case 3:
                    System.out.printf("Informe seu salário líquido para realizarmos o cáculo do seu 13 salário: ");
                    salario = scanner.nextDouble();

                    System.out.printf("Informe o total de meses trabalhados (Máximo de 12 meses): ");
                    mesesTrabalhados = scanner.nextInt();

                    if (mesesTrabalhados > 1 && mesesTrabalhados <= 12) {

                        resultadoNovoSalario += salario;

                        resultadoNovoSalario = (resultadoNovoSalario * mesesTrabalhados / 12);
                        System.out.printf("O valor do seu décimo terceiro salário será de: " + resultadoNovoSalario);
                    } else if (mesesTrabalhados > 12) {
                        System.out.println("MÁXIMO DE MESES MENCIONADO ATINGIDO!");
                        break;
                    }
                case 4:
                    System.out.printf(" Fechando programa...\nAté logo!");
                    break;
            }
        } else {
            System.out.println("COMANDO INVÁLIDO!");
        }
    }
}
