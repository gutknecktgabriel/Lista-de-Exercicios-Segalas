package Exercicios.Exercicios_Logica_OO.Repeticao;

import java.util.Scanner;

public class Exercicio_Repeticao_6 {
    public static void main(String[] args) {

        String myStr = "Gabriel Gutkneckt Fernandes";
        char result = myStr.charAt(0);
        char result2 = myStr.charAt(8);
        char result3 = myStr.charAt(18);
        System.out.printf(String.valueOf(myStr + " " + result + "."));
        System.out.printf(String.valueOf(result2 + "."));
        System.out.println(String.valueOf(result3));
    }
}
