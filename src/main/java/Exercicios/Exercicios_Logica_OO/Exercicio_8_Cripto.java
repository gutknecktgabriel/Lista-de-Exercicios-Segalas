package Exercicios.Exercicios_Logica_OO;

import java.util.List;
import java.util.Scanner;

public class Exercicio_8_Cripto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alfabetoCripto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        try {
            String textoCriptografado;
            String myStr;
            System.out.println("Digite um texto: ");
            myStr = scanner.nextLine();

            for (int i = 0; i < myStr.length(); i++) {
                char result = myStr.charAt(i);
                System.out.print(result);

            }
        } catch (StringIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }
    }
}
