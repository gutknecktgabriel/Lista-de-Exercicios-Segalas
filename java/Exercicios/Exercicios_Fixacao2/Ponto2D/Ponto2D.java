package Exercicios.Exercicios_Fixacao2.Ponto2D;

public class Ponto2D {
    private double pontoHorizontal;
    private double pontoVertical;
    private double marcacaoPlanoCartesiano;

    public Ponto2D(double pontoHorizontal, double pontoVertical, double marcacaoPlanoCartesiano) {
        this.pontoHorizontal = pontoHorizontal;
        this.pontoVertical = pontoVertical;
        this.marcacaoPlanoCartesiano = marcacaoPlanoCartesiano;
    }

    public double getPontoHorizontal() {
        return pontoHorizontal;
    }

    public void setPontoHorizontal(double pontoHorizontal) {
        this.pontoHorizontal = pontoHorizontal;
    }

    public double getPontoVertical() {
        return pontoVertical;
    }

    public void setPontoVertical(double pontoVertical) {
        this.pontoVertical = pontoVertical;
    }

    public double getMarcacaoPlanoCartesiano() {
        return marcacaoPlanoCartesiano;
    }
}
