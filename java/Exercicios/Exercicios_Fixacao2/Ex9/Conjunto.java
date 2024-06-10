package Exercicios.Exercicios_Fixacao2.Ex9;

import java.util.List;

public class Conjunto {
    private List<String> conjunto;
    private int adicionarQtd;

    public Conjunto(List<String> elemento, int adicionarQtd) {
        this.conjunto = elemento;
        this.adicionarQtd = adicionarQtd;
    }

    public List<String> getConjunto() {
        return conjunto;
    }

    public void setConjunto(List<String> conjunto) {
        this.conjunto = conjunto;
    }

    public int getAdicionarQtd() {
        return adicionarQtd;
    }

    public void setAdicionarQtd(int adicionarQtd) {
        this.adicionarQtd = adicionarQtd;
    }

    public void adicionar() {
        if (conjunto.contains(conjunto)){
            System.out.println("O elemento já existe na lista");
        }
        else {
            conjunto.add(String.valueOf(adicionarQtd));
        }
    }

    public void verificarExistencia(){

    }
}
