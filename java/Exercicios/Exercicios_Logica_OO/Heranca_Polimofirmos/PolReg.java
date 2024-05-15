package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos;

public class PolReg {
    private int numeroLados;

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getTamanhoDoLado() {
        return tamanhoDoLado;
    }

    public void setTamanhoDoLado(int tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    private int tamanhoDoLado;

    public PolReg(int numeroLados, int tamanhoDoLado) {
        this.numeroLados = numeroLados;
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public int calculoPerimetro() {
        int resultado = 0;

        return tamanhoDoLado * numeroLados;
    }

    public int calculaAngulo() {
        int resultado = 0;
        int totalAngulo = 0;

        totalAngulo = (numeroLados - 2) * 180;
        return totalAngulo / numeroLados;
    }

    public int calculoArea(){
        int base = 0;
        int altura = 0;
        int area; 
        area = base * altura / 2;
        return 0;
    }
}
