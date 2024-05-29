package POO_Praticas.Threads.Calculadora_Thread_;


import java.util.Scanner;

public class Desafio_2 extends Thread {
    public static int resultado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Desafio_2 thread = new Desafio_2();
        thread.start();
        while (thread.isAlive()) {
            int n1;
            int n2;
            String op;

            System.out.print("Digite o primeiro valor: ");
            n1 = scanner.nextInt();

            System.out.print("Digite a operação desejada");
            System.out.println("Opções: \n  + Para Soma \n  - Para Subtrair\n  * Para multiplicar \n  % Para dividir");
            op = scanner.next();

            System.out.print("Digite o segundo valor: ");
            n2 = scanner.nextInt();

            switch (op) {
                case "+":
                    resultado = n1 + n2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case "-":
                    resultado = n1 - n2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case "*":
                    resultado = n1 * n2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case "%":
                    resultado = n1 / n2;
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
            }
        }
    }
    public void run(){
        resultado++;
    }
}
