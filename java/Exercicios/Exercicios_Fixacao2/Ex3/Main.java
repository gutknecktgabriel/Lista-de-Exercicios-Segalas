package Exercicios.Exercicios_Fixacao2.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        NumeroComplexo numComplexo = new NumeroComplexo(0,0,0,0);


        NumeroComplexo numeroComplexo = new NumeroComplexo(0,0,0,0);
        System.out.println("Informe o tipo de cálculo que você deseja calcular:\n1.Soma\n2.Subtração\n3.Multipliacação\n4.Divisão");
        operacao = scanner.nextInt();

        switch (operacao){
            case 1:
                System.out.println("Resposta: " + numeroComplexo.somar());
                break;
            case 2:
                System.out.println("Resposta: " + numeroComplexo.subtrair());
                break;
            case 3:
                System.out.println("Resposta: " + numeroComplexo.multiplicacao());
                break;
            case 4:
                System.out.println("Resposta: " + numeroComplexo.divisao());
        }
    }
}
