package Exercicios.Exercicios_Logica_OO.Calculadora;

public class CalcDados {
    private double valor1;
    private double valor2;
    private char operador;

    public double getOperando1() {
        return valor1;
    }

    public void setOperando1(double valor1) {
        this.valor1 = valor1;
    }

    public double getOperando2() {
        return valor2;
    }

    public void setOperando2(double valor2) {
        this.valor2 = valor2;
    }

    public char getOperacao() {
        return operador;
    }

    public void setOperacao(char operador) {
        this.operador = operador;
    }
}