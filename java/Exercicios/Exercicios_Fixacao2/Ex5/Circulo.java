package Exercicios.Exercicios_Fixacao2.Ex5;

public class Circulo {

    private double raio;
    private double x;
    private double y;

    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    public Circulo(double raio) {
        this(raio, 0, 0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void inflar(double valor) {
        this.raio += valor;
    }

    public void desinflar(double valor) {
        this.raio -= valor;
        if (this.raio < 0) {
            this.raio = 0;
        }
    }

    public void inflar() {
        inflar(1);
    }

    public void desinflar() {
        desinflar(1);
    }

    public void mover() {
        this.x = 0;
        this.y = 0;
    }

    public void mover(double novoX, double novoY) {
        this.x = novoX;
        this.y = novoY;
    }

    public void mover(Circulo outro) {
        this.x = outro.x;
        this.y = outro.y;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", centro=(" + x + ", " + y + ")]";
    }
}

