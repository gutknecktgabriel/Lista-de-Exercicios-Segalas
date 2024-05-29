package POO_Praticas.Threads.Calculadora_Thread_;


import java.util.Scanner;

public class Desafio_2 extends Thread {
    public static int resultado = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Desafio_2 thread = new Desafio_2();
        thread.start();
        while (thread.isAlive()) {
            int n1;
            int n2;
            int cont = 0;
            int valorMax = 5;
            int valorMin = 1;
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
            for (int i = valorMax; i >= valorMin ; i--) {
                thread.sleep(1000);
                System.out.println("Encerrando o programa em: " + i + " segundos...");
            }
        }
    }
    public void run(){
        resultado++;
    }
}
