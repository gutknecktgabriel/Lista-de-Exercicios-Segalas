package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.NumerosComplexos;

public class Complexo {
    private float real;
    private float imagiaria;

    public Complexo(float real, float imaginaria) {
        this.real = real;
        this.imagiaria = imaginaria;
    }
    public int modulo(int numComplexo){
        return numComplexo;
    }
    public int angulo(){
        int numComplexo = 0;
        double angulo_radianos = Math.atan(numComplexo);
        double angulo_graus = Math.toDegrees(angulo_radianos);
        return (int) angulo_graus;
    }
}
