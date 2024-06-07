package Exercicios.Exercicios_Fixacao2.Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("Maria");
        Pessoa pessoa2 = new Pessoa("Maria");

        System.out.print("Informe o nome da sua mãe: ");
        pessoa.setMae(scanner.next());

        System.out.print("Informe o nome da sua mãe: ");
        pessoa2.setMae(scanner.next());

        System.out.println("É a mesma pessoa ? " + pessoa.getMae().equals(pessoa2.getMae()));

    }
}
