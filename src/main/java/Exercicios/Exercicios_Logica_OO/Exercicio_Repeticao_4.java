package Exercicios.Exercicios_Logica_OO;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_Repeticao_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int delayEmSegundos = new Random().nextInt(10) + 1;

        try {
            // Converte o tempo de espera de segundos para milissegundos
            Thread.sleep(delayEmSegundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int number;
        int resposta = 0;

        number = random.nextInt(100);

        while (resposta != number) {

            System.out.println("Agora!");
            long start = System.currentTimeMillis();

            System.out.println(number);

            System.out.println("Digite o número mencionado: ");
            resposta = scanner.nextInt();
            long end = System.currentTimeMillis();

            if (resposta != number) {
                System.out.println("NÚMERO ERRADO!");
            }

            System.out.print("O tempo levado para digitar o mesmo número foi de: ");
            System.out.printf(String.valueOf(end - start));
            System.out.println(" milissegundos");
            break;
        }
    }
}
