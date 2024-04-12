package Exercicios.Exercicios_Logica_OO;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exerc_8_Cripto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Varaiavel frase
        String frase;


        System.out.print("Digite a frase para criptografarmos: ");
        frase = scanner.nextLine();
        String criptografada = criptografar(frase);
        System.out.println(criptografada);
        String descriptografada = descriptografar(criptografada);
        System.out.println(descriptografada);

    }

    //Clase privada para rearlizarmos a conversão da frase para criptografada utilizando tabela ASCII
    private static String criptografar(String frase){
        byte[] letras = frase.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i <frase.length() ; i++) {
            letras[i] = (byte) (letras[i] + 1);
            if (letras[i] == 123){
                letras[i] = 97;
            }
            if (letras[i] == 33){
                letras[i] = 48;
            }
        }

        String fraseCriptografada = new String(letras, StandardCharsets.UTF_8);
        return fraseCriptografada;
    }

    //Classe com metodo para aprensetar a frase do usuario, porem descriptografada
    private static String descriptografar(String frase){
        byte[] letras = frase.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < frase.length() ; i++) {
            letras[i] = (byte) (letras[i] - 1);
            if (letras[i] == 96){
                letras[i] = 122;
            }
            if (letras[i] == 47){
                letras[i] = 32;
            }
        }
        String fraseDescriprografada = new String(letras, StandardCharsets.UTF_8);
        return fraseDescriprografada;
    }
}
