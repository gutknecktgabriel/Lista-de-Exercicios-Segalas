package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.NumerosComplexos;

public class Real extends Complexo {

    public Real(float numReal) {
        super(numReal, 0);
    }

    public int sinal() {
        if (this.modulo() == 0) {
            return 0;
        } else if (this.modulo() > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}



