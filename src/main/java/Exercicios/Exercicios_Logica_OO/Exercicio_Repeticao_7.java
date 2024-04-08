package Exercicios.Exercicios_Logica_OO;

import java.util.Scanner;

public class Exercicio_Repeticao_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario;

        System.out.printf("Informe seu nome para visualizá-lo de forma invertida: ");
        nomeUsuario = scanner.nextLine();

        StringBuilder stringInvertida = new StringBuilder(nomeUsuario);
        stringInvertida.reverse();

        String resultado = stringInvertida.toString();
        System.out.println("Nome invetido: " + resultado);
    }
}
