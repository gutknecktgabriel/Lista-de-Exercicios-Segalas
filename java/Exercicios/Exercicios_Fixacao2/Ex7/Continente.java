package Exercicios.Exercicios_Fixacao2.Ex7;

import Exercicios.Exercicios_Fixacao2.Ex6.Pais;

import java.util.ArrayList;

public class Continente {
    private String nomeContinente;
    private ArrayList<String> paises;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public void adicionarPaises(Pais pais) {
        pais.add(pais);
    }

}
