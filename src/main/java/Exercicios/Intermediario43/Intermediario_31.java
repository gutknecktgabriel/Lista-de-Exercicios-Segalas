package Exercicios.Intermediario43;

import java.util.Scanner;

public class Intermediario_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int somadeIdades = 0;
        int mediadeIdades = 0;


        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a idade da pessoa " + i + ":");
            idade = scanner.nextInt();

            somadeIdades += idade;
            mediadeIdades = somadeIdades / 4;
        }
        System.out.println("A média de idade é: " + mediadeIdades + " anos de idade");
        System.out.println("Digite 0 para finalizar o programa...");
        idade = scanner.nextInt();

    }
}
