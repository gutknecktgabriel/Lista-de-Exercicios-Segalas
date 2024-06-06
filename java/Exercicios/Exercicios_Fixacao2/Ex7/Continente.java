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

    public double dimensaoTotal(Pais pais) {
        return pais.getDimensao();
    }

    public int populacaoTotal(Pais pais) {
        return pais.getPopulacao();
    }

    public double densidadePopulacional(Pais pais) {
        return pais.getPopulacao() / pais.getDimensao();
    }

    public Pais getPaisMaiorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }
        Pais maiorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }
    public Pais getPaisMenorPopulação(){
        if (paises.isEmpty()){
            return null;
        }
        Pais menorPopulação = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulação.getPopulacao()) {
                menorPopulação = pais;
            }
        }
        return menorPopulação;
    }

}