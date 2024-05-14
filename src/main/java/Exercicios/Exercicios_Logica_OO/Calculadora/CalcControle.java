package Exercicios.Exercicios_Logica_OO.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcControle {

    CalcDados calcDados = new CalcDados();
    Scanner scanner = new Scanner(System.in);

    public void executar() {
        try {
            System.out.println("===============CALCULADORA===============");

            System.out.println("Digite o primeiro valor: ");
            calcDados.setOperando1(scanner.nextDouble());


            System.out.println("Qual a operação que você deseja executar?");

            System.out.println("Opções de operações: \n'+' para somar \n'-' para subtrair \n'*' para multiplicação \n'/' para divisão ");
            calcDados.setOperacao(scanner.next().charAt(0));

            while (calcDados.getOperacao() != 's') {
                System.out.println("Digite o segundo valor: ");
                calcDados.setOperando2(scanner.nextDouble());
                double resultado = opera(calcDados.getOperando1(), calcDados.getOperando2(), calcDados.getOperacao());
                calcDados.setOperando1(resultado);
                System.out.println("Resultado: " + calcDados.getOperando1());
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas números!");
        }
    }

    public double opera(double operador1, double operador2, char op) {
        double resultado = 0;
        switch (op) {
            case '+':
                resultado += (operador1 + operador2);
                break;
            case '-':
                resultado += (operador1 - operador2);
                break;
            case '*':
                resultado += (operador1 * operador2);
                break;
            case '/':
                resultado += (operador1 / operador2);
                break;
            case 's':
                System.exit(0);
        }
        return resultado;
    }
}
