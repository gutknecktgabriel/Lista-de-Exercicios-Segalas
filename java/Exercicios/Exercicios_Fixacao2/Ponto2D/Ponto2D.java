package Exercicios.Exercicios_Fixacao2.Ponto2D;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ponto2D(Ponto2D ponto){
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
}
