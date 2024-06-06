package Exercicios.Exercicios_Fixacao2.Ex7;

public class Pais {
    private String nomePais;
    private int populacao;
    private double dimensao;

    public Pais(String nomePais, int populacao, double dimensao) {
        this.nomePais = nomePais;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getNomePais() {
        return nomePais;
    }

    public int getPopulacao() {
        return populacao;
    }

    public double getDimensao() {
        return dimensao;
    }
}
