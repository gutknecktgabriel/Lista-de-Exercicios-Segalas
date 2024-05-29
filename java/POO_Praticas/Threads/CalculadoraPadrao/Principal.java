package POO_Praticas.Threads.CalculadoraPadrao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Desafio thread = new Desafio();
        int resultado = 0;

        thread.start();

        while (thread.isAlive()) {
            System.out.print("Digite o primeiro valor: ");
            thread.setNumber_1(scanner.nextInt());

            System.out.println("Digite a operação matemática que você deseja realizar:");

            System.out.println("Opções: \n  + Para Soma \n  - Para Subtrair\n  * Para multiplicar \n  % Para dividir");
            thread.setOp(scanner.next());


            System.out.print("Digite o segundo valor: ");
            thread.setNumber_2(scanner.nextInt());


            switch (thread.getOp()) {
                case "+":
                    resultado = thread.getNumber_1() + thread.getNumber_2();
                    System.out.println("Calculando...");
                    thread.sleep(1000);
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case "-":
                    resultado = thread.getNumber_1() - thread.getNumber_2();
                    System.out.println("Calculando...");
                    thread.sleep(1000);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case "*": resultado = thread.getNumber_1() * thread.getNumber_2();
                    System.out.println("Calculando...");
                    thread.sleep(1000);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case "%": resultado = thread.getNumber_1() / thread.getNumber_2();
                    System.out.println("Calculando...");
                    thread.sleep(1000);
                    System.out.println("Resultado da divisão: " + resultado);
            }
        }
    }
}
