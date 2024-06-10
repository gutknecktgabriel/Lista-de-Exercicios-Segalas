package Exercicios.Exercicios_Fixacao2.Ex9;

import java.util.List;

public class Conjunto {
    private List<String> conjunto;
    private String elemento;
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

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void adicionar() {
        if (conjunto.contains(elemento)){
            System.out.println("O elemento já existe na lista");
        }
        else {
            conjunto.add(String.valueOf(elemento));
        }
    }

    public void verificarExistencia(){
        if (conjunto.contains(elemento)){
            System.out.println("O elemento ja pertence ao conjunto");
        }
    }
}
