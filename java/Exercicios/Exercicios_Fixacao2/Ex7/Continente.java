package Exercicios.Exercicios_Fixacao2.Ex7;

import java.util.ArrayList;

public class Continente extends ArrayList {
    private String nomeContinente;
    private ArrayList<Pais> paises;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

}