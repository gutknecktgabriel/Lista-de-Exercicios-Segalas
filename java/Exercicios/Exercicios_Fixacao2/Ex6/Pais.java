package Exercicios.Exercicios_Fixacao2.Ex6;

public class Pais {
    private String codIso;
    private String nome;
    private double dimensao;
    private int populacao;

    public Pais(String codIso, String nome, double dimensao) {
        this.codIso = codIso;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodIso() {
        return codIso;
    }

    public void setCodIso(String codIso) {
        this.codIso = codIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public boolean verificarIgualdade(Pais pais) {
        return this.codIso.equals(pais.getCodIso());
    }


    public double densidade() {
        return this.populacao / this.densidade();
    }
}
