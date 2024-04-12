package Exercicios.Exercicios_Logica_OO;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exercicio_8_Cripto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase a ser criptografada: ");
        String frase = sc.nextLine();
        String criptografada = criptografar(frase);
        System.out.println(criptografada);
        String descriptograda = descriptografar(criptografada);
        System.out.println(descriptograda);
    }

    private static String criptografar(String frase) {
        byte[] letras = frase.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < frase.length(); i++) {
            letras[i] = (byte) (letras[i] + 1);
            if (letras[i] == 123) {
                letras[i] = 97;
            }
            if (letras[i] == 33) {
                letras[i] = 48;
            }
        }
        String fraseCriptografada = new String(letras, StandardCharsets.UTF_8);
        return fraseCriptografada;
    }

    private static String descriptografar(String frase) {
        byte[] letras = frase.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < frase.length(); i++) {
            letras[i] = (byte) (letras[i] - 1);
            if (letras[i] == 96) {
                letras[i] = 122;
            }
            if (letras[i] == 47) {
                letras[i] = 32;
            }
        }
        String fraseDescriptografada = new String(letras, StandardCharsets.UTF_8);
        return fraseDescriptografada;
    }
}


