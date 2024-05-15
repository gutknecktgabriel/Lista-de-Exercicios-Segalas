package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.NumerosComplexos;

public class Complexo {
    private float real;
    private float numeroImaginario;

    public Complexo(float real, float numeroImaginario) {
        this.real = real;
        this.numeroImaginario = numeroImaginario;
    }

    public float getReal() {
        return real;
    }

    public float getImagiaria() {
        return numeroImaginario;
    }
    public double modulo(){
        return Math.sqrt(real * real + numeroImaginario * numeroImaginario);
    }
    public double angulo(){
        return Math.toDegrees(Math.atan2(numeroImaginario, real));
    }
}
