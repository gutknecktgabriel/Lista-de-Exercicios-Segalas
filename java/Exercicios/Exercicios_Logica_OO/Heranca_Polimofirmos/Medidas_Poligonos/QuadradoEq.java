package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Medidas_Poligonos;

public class QuadradoEq extends  PolReg{
    public QuadradoEq(int numeroLados, int tamanhoDoLado) {
        super(numeroLados, tamanhoDoLado);
    }

    @Override
    public int calculoArea() {
        int area;
        int lado = 0;
        area = lado * lado;
        return area;
    }
}
