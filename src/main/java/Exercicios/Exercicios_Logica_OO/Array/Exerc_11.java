package Exercicios.Exercicios_Logica_OO.Array;

import java.util.Scanner;

public class Exerc_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numeroQueSeraDivido = 0;


        System.out.println("Informe um número inteiro: ");
        numeroQueSeraDivido = scanner.nextLong();

        System.out.println("Resultado dividido por 3");
        long numberResult_3 = chamadoRecursivo_Por_3(numeroQueSeraDivido);
        System.out.println(numberResult_3);

        System.out.println("Resultado dividido por 5");
        long numberResult_5 = chamadoRecursivo_Por_5(numeroQueSeraDivido);
        System.out.println(numberResult_5);

        System.out.println("Resultado dividido por 7");
        long numbeResult_7 = chamadoRecursivo_Por_7(numeroQueSeraDivido);
        System.out.println(numbeResult_7);

        System.out.println("Resultado dividido por 11");
        long numberResult_11 = chamadoRecursivo_Por_11(numeroQueSeraDivido);
        System.out.println(numberResult_11);
    }

    private static long chamadoRecursivo_Por_3(long b) {
        long numeroQueSeraDividido = b;
        for (int i = 3; i < Math.sqrt(b); i++) {
            if (b % i == 0) {
                return chamadoRecursivo_Por_3(numeroQueSeraDividido / i);
            }
        }
        return numeroQueSeraDividido;
    }

    private static long chamadoRecursivo_Por_5(long c) {
        long numeroQueSeraDividido = c;
        for (int i = 5; i < Math.sqrt(c); i++) {
            if (c % i == 0) {
                return chamadoRecursivo_Por_5(numeroQueSeraDividido / i);
            }
        }
        return numeroQueSeraDividido;
    }

    private static long chamadoRecursivo_Por_7(long d) {
        long numeroQueSeraDividido = d;
        for (int i = 7; i < Math.sqrt(d); i++) {
            if (d % i == 0) {
                return chamadoRecursivo_Por_7(numeroQueSeraDividido / i);
            }
        }
        return numeroQueSeraDividido;
    }

    private static long chamadoRecursivo_Por_11(long e) {
        long numeroQueSeraDividido = e;
        for (int i = 11; i < Math.sqrt(e); i++) {
            if (e % i == 0) {
                return chamadoRecursivo_Por_11(numeroQueSeraDividido / i);
            }
        }
        return numeroQueSeraDividido;
    }
}
    

