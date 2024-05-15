package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos;

public class PolReg {
    private int numeroLados;
    private int tamanhoDoLado;

    public PolReg(int numeroLados, int tamanhoDoLado) {
        this.numeroLados = numeroLados;
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public int calculoPerimetro() {
        int resultado = 0;

        resultado = tamanhoDoLado * numeroLados;
        return resultado;
    }

    public int calculaAngulo() {
        int resultado = 0;
        int totalAngulo = 0;

        totalAngulo = (numeroLados - 2) * 180;
        resultado = totalAngulo / numeroLados;
        return resultado;
    }
}
