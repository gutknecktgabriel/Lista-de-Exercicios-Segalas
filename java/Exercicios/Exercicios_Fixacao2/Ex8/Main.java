package Exercicios.Exercicios_Fixacao2.Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa maria = new Pessoa("Maria");
        Pessoa joao = new Pessoa("Joao");

        System.out.print("Informe o nome da sua mãe: ");
        maria.setMae(scanner.next());

        System.out.print("Informe o nome da sua mãe: ");
        joao.setMae(scanner.next());

        System.out.print("Informe o nome do seu pai: ");
        maria.setPai(scanner.next());

        System.out.print("Informe o nome do seu pai: ");
        joao.setPai(scanner.next());


    }
}
