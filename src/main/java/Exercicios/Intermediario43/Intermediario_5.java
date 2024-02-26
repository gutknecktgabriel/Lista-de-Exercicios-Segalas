//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Teste;

import java.util.Scanner;

public class Intermediario_5 {
    public Intermediario_5() {
    }

    public static void main(String[] args) {
        ordenar();
    }

    public static void ordenar() {
        Scanner terminal = new Scanner(System.in);
        int maior = 0;
        int seila = 0;
        int menor = 0;
        int meio = 0;
        System.out.println("Informe o primeiro número");
        int numero1 = Integer.parseInt(terminal.nextLine());
        System.out.println("Informe o segundo número");
        int numero2 = Integer.parseInt(terminal.nextLine());
        if (numero2 > numero1) {
            menor = numero1;
            meio = numero1;
            maior = numero2;
        } else {
            maior = numero1;
            meio = numero1;
            menor = numero2;
        }

        System.out.println("Informe o terceiro número");
        int numero3 = Integer.parseInt(terminal.nextLine());
        if (numero3 > maior) {
            meio = maior;
            maior = numero3;
        } else if (numero3 < menor) {
            maior = meio;
            meio = menor;
            menor = numero3;
        } else {
            meio = numero3;
        }

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }
}
