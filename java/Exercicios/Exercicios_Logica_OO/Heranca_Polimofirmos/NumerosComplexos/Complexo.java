package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.NumerosComplexos;

public class Complexo {
    private float numReal;
    private float numeroImaginario;

    public Complexo(float numReal, float numeroImaginario) {
        this.numReal = numReal;
        this.numeroImaginario = numeroImaginario;
    }

    public float getNumReal() {
        return numReal;
    }

    public float getImagiaria() {
        return numeroImaginario;
    }
    public double modulo(){
        return Math.sqrt(numReal * numReal + numeroImaginario * numeroImaginario);
    }
    public double angulo(){
        return Math.toDegrees(Math.atan2(numeroImaginario,numReal));
    }
}