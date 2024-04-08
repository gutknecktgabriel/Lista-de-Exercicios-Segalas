package Exercicios.Exercicios_Logica_OO;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_Repeticao_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (ePermutacao(num1, num2)){
            System.out.println("É permutação");
        }
        else{
            System.out.println("Não é permutação");
        }
    }
    private static boolean ePermutacao(int num1, int num2){
        int[] v1 = contaDigitos(num1);
        int[] v2 = contaDigitos(num2);

        return Arrays.equals(v1, v2);
    }
    private static int[] contaDigitos(int num1){
        int []v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = 0;
        }

        while (num1 > 0){
            v[num1 % 10]++;
            num1 = num1/10;
        }
        return v;
    }
}