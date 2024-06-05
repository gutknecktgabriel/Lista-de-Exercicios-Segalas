package Exercicios.Exercicios_Fixacao2.Ex4;

public class Reta {
    private double coeAngular;
    private double coeLinear;

    public Reta(double coeAngular, double coeLinear) {
        this.coeAngular = coeAngular;
        this.coeLinear = coeLinear;
    }
    public Reta(double pontoHorizontal1, double pontoVertical1, double pontoHorizontal2, double pontoVertical2) {
        if (pontoHorizontal1 == pontoHorizontal2) {
            throw new IllegalArgumentException("Os pontos não podem ter o mesmo valor do ponto 1 (reta vertical não é suportada).");
        }
        this.coeAngular = (pontoVertical2 - pontoVertical1) / (pontoHorizontal2 - pontoHorizontal1);
        this.coeLinear = pontoVertical1 - this.coeLinear * pontoHorizontal1;
    }

    public double getCoeAngular() {
        return coeAngular;
    }

    public double getCoeLinear() {
        return coeLinear;
    }

    public boolean pertenceAReta(double ponto1, double ponto2) {
        return ponto1 == coeAngular * ponto2 + coeLinear;
    }

    public String toString() {
        return "y = " + coeAngular + " x + " + coeLinear;
    }

    public Ponto interseccao(Reta outraReta) {
        if (this.coeAngular == outraReta.coeAngular) {
            return null;
        }
        double ponto1 = (outraReta.coeLinear - this.coeLinear) / (this.coeAngular - outraReta.getCoeAngular());
        double ponto2 = this.coeAngular * ponto1 + this.coeLinear;
        return new Ponto(ponto1, ponto2);
    }

    public static class Ponto {
        private double ponto1;
        private double ponto2;

        public Ponto(double ponto1, double ponto2) {
            this.ponto1 = ponto1;
            this.ponto2 = ponto2;
        }

        public double getPonto1() {
            return ponto1;
        }

        public double getPonto2() {
            return ponto2;
        }

        public String toString() {
            return "(" + ponto1 + ", " + ponto2 + ")";
        }
    }
}
