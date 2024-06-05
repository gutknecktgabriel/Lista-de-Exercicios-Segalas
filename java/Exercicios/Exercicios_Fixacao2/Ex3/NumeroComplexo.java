package Exercicios.Exercicios_Fixacao2.Ex3;

public class NumeroComplexo {
    private int numInteiro;
    private int numFracionario;
    private int a = 30;
    private int bi = 32;
    private int b = 22;
    private int d = 90;
    private int c = 12;
    private int di = 56;
    private int i = 0;
    private int resultado;
    private int somaPrimaria;
    private int somaSecundaria;
    private int somaBC;
    private int somaAC;
    private int somaBD;
    private int somaAD;

    public NumeroComplexo(int numComplexo, int numInteiro, int numFracionario, int resultado) {
        this.numInteiro = numInteiro;
        this.numFracionario = numFracionario;
        this.resultado = resultado;
    }

    public int getNumInteiro() {
        return numInteiro;
    }

    public void setNumInteiro(int numInteiro) {
        this.numInteiro = numInteiro;
    }

    public int getNumFracionario() {
        return numFracionario;
    }

    public void setNumFracionario(int numFracionario) {
        this.numFracionario = numFracionario;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDi() {
        return di;
    }

    public void setDi(int di) {
        this.di = di;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getResultado() {
        return resultado;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getSomaBC() {
        return somaBC;
    }

    public int getSomaAC() {
        return somaAC;
    }

    public int getSomaBD() {
        return somaBD;
    }

    public int getSomaAD() {
        return somaAD;
    }

    public int somaAC() {
        return somaAC = a + c;
    }

    public int somaBC() {
        return somaBC = b + c;
    }

    public int somaBD() {
        return somaBD = b + d;
    }

    public int somaAD() {
        return somaAD = a + d;
    }

    public int getSomaPrimaria() {
        return somaPrimaria;
    }

    public int getSomaSecundaria() {
        return somaSecundaria;
    }


    public int somar() {
        somaPrimaria = (a + bi) + (c + di);
        somaSecundaria += somaPrimaria + (a + c) + (b + d);
        resultado += somaSecundaria;
        return resultado;
    }

    public int subtrair() {
        somaPrimaria = (a + bi) - (c + di);
        somaSecundaria += somaPrimaria + (a - c) + (b - d);
        resultado += somaSecundaria;
        return resultado;
    }

    public int multiplicacao() {
        somaPrimaria = (a + bi) * (c + di);
        somaSecundaria += somaPrimaria + (somaAC() - somaBD() + (somaAD() + somaBC()) + i);
        resultado += somaPrimaria;
        return resultado;
    }
    public int divisao() {
        somaPrimaria = (a + bi) / (c + di);
        somaSecundaria += somaPrimaria + (somaAC + somaBD / (c * c + d * d) + (somaBC() - somaAD() / (c * c + d * d)) + i);
        resultado += somaPrimaria;
        return resultado;
    }
}
