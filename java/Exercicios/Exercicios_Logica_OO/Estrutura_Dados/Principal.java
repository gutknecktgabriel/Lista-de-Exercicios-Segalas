package Exercicios.Exercicios_Logica_OO.Estrutura_Dados;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empregado[] empregados = new Empregado[5];

        for (int i = 0; i < empregados.length; i++) {
            Empregado empregado = new Empregado("", "", 0);

            System.out.println("Informe o nome do empregado " + (i + 1) + " :");
            empregado.setNome(scanner.nextLine());

            System.out.println("Informe o CPF do empregado " + (i + 1) + " :");
            empregado.setCpf(scanner.next());

            System.out.println("Informe o salario do empregado " + (i + 1) + " :");
            empregado.setSalario(scanner.nextDouble());
            scanner.nextLine();
            empregados[i] = new Empregado(empregado.getNome(), empregado.getCpf(), empregado.getSalario());
        }

            bubbleSort(empregados);
        System.out.println("Empregados ordenados pelo salário:");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
    private static void bubbleSort(Empregado[] empregados) {
    }
}
