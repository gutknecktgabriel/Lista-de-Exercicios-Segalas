package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.NumerosComplexos;

public class Principal {
    public static void main(String[] args) {
        Complexo numeroComplexo = new Complexo(3, 1);
        System.out.println("Módulo do número complexo: " + numeroComplexo.modulo());
        System.out.println("Ângulo do número complexo: " + numeroComplexo.angulo() + " graus");

        Real numeroRealPositivo = new Real(5);
        Real numeroRealNegativo = new Real(-2);

        System.out.println("Número real positivo: " + numeroRealPositivo.sinal());
        System.out.println("Número real negativo: " + numeroRealNegativo.sinal());
    }
}