package Exercicios.Exercicios_Fixacao2.Ex7;

import Exercicios.Exercicios_Fixacao2.Ex6.Pais;

import java.util.ArrayList;

public class Continente {
    private String nomeContinente;
    private ArrayList<String> paises;
    private double dimensaoContinente;
    private int populacaoContinente;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public double getDimensaoContinente() {
        return dimensaoContinente;
    }

    public void setDimensaoContinente(double dimensaoContinente) {
        this.dimensaoContinente = dimensaoContinente;
    }

    public int getPopulacaoContinente() {
        return populacaoContinente;
    }

    public void setPopulacaoContinente(int populacaoContinente) {
        this.populacaoContinente = populacaoContinente;
    }

    public void adicionarPaises(Pais pais) {
        pais.add(pais);
    }

    public double dimensaoContinente() {
        return dimensaoContinente;
    }

    public int populacaoContinente() {
        return populacaoContinente;
    }

    public double densidadePoulacional() {
        return this.populacaoContinente / this.densidadePoulacional();
    }
}
