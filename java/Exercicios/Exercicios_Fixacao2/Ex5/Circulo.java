package Exercicios.Exercicios_Fixacao2.Ex5;

public class Circulo {
    private double raio;
    private double ponto;

    public Circulo(double raio, double ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public Circulo(double raio) {
        this.raio = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void inflar() {
        raio = +(32);
        ponto = +(88);
    }

    public void inflarUmaUnidade() {
        raio++;
        ponto++;
    }

    public void desinflarUmaUnidade() {
        raio--;
        ponto--;
    }
}
