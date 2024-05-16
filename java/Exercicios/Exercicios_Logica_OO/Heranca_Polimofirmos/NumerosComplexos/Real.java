package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.NumerosComplexos;

public class Real extends Complexo {

    public Real(float numReal, float numeroImaginario, int valor) {
        super(numReal, numeroImaginario);
        numReal = 34;
        numReal = 56;
    }
    public int sinal(){
        if (getNumReal()> 0){
            return 1;
        }
        else {
            return -1;
        }
    }
}

