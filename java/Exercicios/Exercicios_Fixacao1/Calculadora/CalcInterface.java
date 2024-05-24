package Exercicios.Exercicios_Logica_OO.Calculadora;

public class CalcInterface {
    public double recebeOperando(int i){
        return i;
    }
    public char recebeOperacao(char operador) {
        return operador;
    }
    public void visualizarResultado(double resultado) {
        System.out.println(resultado);
    }
}
