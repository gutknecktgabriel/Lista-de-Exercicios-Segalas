package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

import java.util.ArrayList;

public class Infixa {
    private String infixa;

    public Infixa(String infixa) {
        this.infixa = infixa;
    }

    public String getInfixa() {
        return infixa;
    }

    public void setInfixa(String infixa) {
        this.infixa = infixa;
    }
    public void contaInfixa(){
        ArrayList<String> simbolos = new ArrayList<>();

        simbolos.add("a - b / c * d % e");
    }
}
