package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Medidas_Poligonos;

public abstract class TrianguloEq extends PolReg{
    public TrianguloEq(int numeroLados, int tamanhoDoLado) {
        super(numeroLados, tamanhoDoLado);
    }

    public int calculoArea() {
        int base = 0;
        int altura = 0;
        int area;
        area = base * altura;
        return area;
    }
}
