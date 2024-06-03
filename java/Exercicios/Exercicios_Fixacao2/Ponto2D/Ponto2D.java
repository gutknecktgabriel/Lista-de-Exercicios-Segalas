package Exercicios.Exercicios_Fixacao2.Ponto2D;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void moverPontos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moverPontos(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ponto2D ponto2D = (Ponto2D) obj;
        return Double.compare(ponto2D.x, x) == 0 &&
                Double.compare(ponto2D.y, y) == 0;
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double calcularDistancia(Ponto2D outro) {
        double deltaX = this.x - outro.x;
        double deltaY = this.y - outro.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public Ponto2D clone(){
        return new Ponto2D(this);
    }
}
