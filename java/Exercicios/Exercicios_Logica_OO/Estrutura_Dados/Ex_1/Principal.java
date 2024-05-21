package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empregado> empregados = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Empregado empregado = new Empregado("", "", 0);

            System.out.println("Informe o nome do empregado " + (i + 1) + " :");
            empregado.setNome(scanner.nextLine());

            System.out.println("Informe o CPF do empregado " + (i + 1) + " :");
            empregado.setCpf(scanner.next());

            System.out.println("Informe o salario do empregado " + (i + 1) + " :");
            empregado.setSalario(scanner.nextDouble());
            scanner.nextLine();

            empregados.add(new Empregado(empregado.getNome(), empregado.getCpf(), empregado.getSalario()));

        }

        deleteCPF(empregados);
        System.out.println("Digite um CPF para remover da lista: ");
        String elementoParaRemover = scanner.next();

        if (empregados.remove(elementoParaRemover == empregados.removeFirst().getCpf())){
            System.out.println("CPF removido com sucesso");
        }
        else {
            System.out.println("CPF não se encontra na lista, verifique se o mesmo foi removido.");
        }

        System.out.println("Lista de empregados atualizado: ");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }

        System.out.println("----------------------------------------------------");
        bubbleSort(empregados);
        System.out.println("Lista de empregados ordenados pelo salário:");

        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
    private static void bubbleSort(ArrayList<Empregado> empregados) {
    }
    private static void deleteCPF(ArrayList<Empregado> empregados){
    }
}


