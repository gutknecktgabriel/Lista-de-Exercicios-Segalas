package Exercicios.Exercicios_Fixacao2.Ex3;

public class NumeroComplexo {
    private int numInteiro;
    private int numFracionario;
    private int a;
    private int bi;
    private int b;
    private int d;
    private int c;
    private int di;
    private int i;
    private int resultado;
    private int somaBC;
    private int somaAC;
    private int somaBD;
    private int somaAD;

    public NumeroComplexo(int numInteiro, int numFracionario) {
        this.numInteiro = numInteiro;
        this.numFracionario = numFracionario;
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

}
