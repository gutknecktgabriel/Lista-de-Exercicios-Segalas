package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Medidas_Poligonos;

public class PolReg {
    private int numeroLados;
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
