package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Medidas_Poligonos;

public class TrianguloEq extends PolReg{
    public TrianguloEq(int numeroLados, int tamanhoDoLado) {
        super(numeroLados, tamanhoDoLado);
    }
    @Override
    public int calculoArea() {
        int base = 0;
        int altura = 0;
        int area;
        area = base * altura;
        return area;
    }
}
