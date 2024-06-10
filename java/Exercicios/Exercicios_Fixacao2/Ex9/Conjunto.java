package Exercicios.Exercicios_Fixacao2.Ex9;

import java.util.List;

public class Conjunto {
    private int adicionaQtd;
    private int removerQtd;
    private List<String> conjunto;
    private String elemento;
    private String[] elementos;


    public Conjunto() {
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getAdicionaQtd() {
        return adicionaQtd;
    }

    public void setAdicionaQtd(int adicionaQtd) {
        this.adicionaQtd = adicionaQtd;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public int getRemoverQtd() {
        return removerQtd;
    }

    public void setRemoverQtd(int removerQtd) {
        this.removerQtd = removerQtd;
    }

    public void adicionar(String elemento) {
        if (conjunto.contains(elemento)) {
            System.out.println("O elemento já existe na lista");
        } else {
            conjunto.add((elemento));
        }
        adicionaQtd++;
    }

    public void remover(String elemento) {
        if (conjunto.contains(elemento)) {
            System.out.println("Error");
        } else {
            conjunto.remove(String.valueOf(elemento));
            removerQtd--;
        }
    }

    public boolean verificarExistencia(String elemento) {
        return elemento.contains(elemento);
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : this.elementos) {
            resultado.adicionar(elemento);
        }
        for (String elemento : outro.elementos) {
            resultado.adicionar(elemento);
        }
        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultadoInter = new Conjunto();
        for (String elemento : this.elementos) {
            resultadoInter.verificarExistencia(elemento);
        }
        for (String elemento : outro.elementos) {
            verificarExistencia(elemento);
        }
        return resultadoInter;
    }

    public void remover() {
        if (conjunto.contains(elemento)) {
            System.out.println("O elemento já existe na lista");
        } else {
            conjunto.remove(String.valueOf(elemento));
            adicionaQtd--;
        }
    }
}

