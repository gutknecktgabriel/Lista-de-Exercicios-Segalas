package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos;

public class Triangulo extends PolReg{
    public Triangulo(int numeroLados, int tamanhoDoLado) {
        super(numeroLados, tamanhoDoLado);

    }
    public String triangulo;

    @Override
    public int calculoArea() {
        return calculoArea(triangulo);
    }
}
