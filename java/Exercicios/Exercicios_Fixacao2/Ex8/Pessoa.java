package Exercicios.Exercicios_Fixacao2.Ex8;


import java.util.Objects;

public class Pessoa {
    private String nome;
    private String mae;
    private String pai;

    public Pessoa(String nome, String mae, String pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(mae, pessoa.mae) && Objects.equals(pai, pessoa.pai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mae, pai);
    }

    public boolean saoIrmas(Pessoa outraPessoa) {
        if (this.pai != null && outraPessoa.getPai() != null && this.pai.equals(outraPessoa.getPai())) {
            return true;
        }
        if (this.mae != null && outraPessoa.getMae() != null && this.mae.equals(outraPessoa.getMae())) {
            return true;
        }
        return false;
    }
    public void antecessor() {

    }
}



