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

    public Pais paisMaiorPopulacao() {
        if (paises.isEmpty()) {
            System.out.println("Não há países adicionados para realizar o processo.");
        }
        Pais maiorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    public Pais paisMenorPopulação() {
        if (paises.isEmpty()) {
            System.out.println("Não há países adicionados para realizar o processo.");
        }
        Pais menorPopulação = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulação.getPopulacao()) {
                menorPopulação = pais;
            }
        }
        return menorPopulação;
    }

    public Pais paisMaiorDimensao() {
        if (paises.isEmpty()) {
            System.out.println("Não há países adicionados para realizar o processo.");
        }
        Pais maiorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() > maiorDimensao.getDimensao()) {
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    public Pais paisMenorDimensao() {
        if (paises.isEmpty()) {
            System.out.println("Não há países adicionados para realizar o processo.");
        }
        Pais menorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() < menorDimensao.getDimensao()) {
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    public double razaoTerritorial() {
        double resultadoRazao;
        resultadoRazao = paisMaiorDimensao().getDimensao() / paisMenorDimensao().getDimensao();
        return resultadoRazao;
    }
}