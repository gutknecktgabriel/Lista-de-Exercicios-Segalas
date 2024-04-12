package Exercicios.Exercicios_Logica_OO;

import java.util.Scanner;

public class Exercicio_8_Cripto {


    private static char[] alfabetoCripto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {


        String textoUsuario1 = "gabz";
        String resultCripto = criptografar(textoUsuario1);
        String resultDescripto = descriptografar(resultCripto);


        System.out.printf("Texto criptografado: ");
        retornar(resultCripto);
        System.out.printf("Texto descriptografado: ");
        retornar(resultDescripto);
    }

    private static void retornar(String frases) {

        System.out.println(frases);

        System.out.println("\n");
    }

    private static String criptografar(String frases) {
        char[] resultCripto = new char[frases.length()];

        for (int i = 0; i < resultCripto.length; i++) {
            for (int j = 0; j < alfabetoCripto.length; j++) {
                if (frases.charAt(i) == alfabetoCripto[j]) {
                    if (frases.charAt(i) == 'z') {
                        resultCripto[i] = alfabetoCripto[0];
                    } else {
                        resultCripto[i] = alfabetoCripto[j + 1];
                    }
                }
            }
        }
        return String.valueOf(resultCripto.toString());
    }

    private static String descriptografar(String resultCripto) {
        char[] descriptografada = new char[resultCripto.length()];
        for (int i = 0; i < resultCripto.length(); i++) {
            for (int j = 0; j < alfabetoCripto.length; j++) {
                if (resultCripto.charAt(i) == (alfabetoCripto[j])) {
                    descriptografada = validacaoCaracter(resultCripto, descriptografada);
                }
            }
        }
        return String.valueOf(descriptografada.toString());
    }

    private static char[] validacaoCaracter(String validacaoDoA, char[] descriptografada) {
        try {
            for (int i = 0; i < alfabetoCripto.length; i++) {
                if (validacaoDoA.charAt(i) == 'a') {
                    descriptografada[i] = alfabetoCripto[0];
                }
            }
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }
        return descriptografada;
    }
}


