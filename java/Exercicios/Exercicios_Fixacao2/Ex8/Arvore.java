package Exercicios.Exercicios_Fixacao2.Ex8;

public class Arvore {
    private String nome;
    private String pai;
    private String mae;

    public Arvore(String nome, String pai, String mae) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public String getNome() {
        return nome;
    }

    public String getPai() {
        return pai;
    }

    public String getMae() {
        return mae;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public boolean verificarIgualdade() {
        return nome.equals(mae);
    }

    public boolean irmaVerificacao() {

    }
}