package Exercicios.Exercicios_Fixacao2.Ex8;

public class Pessoa {
    private String nome = "Gabriel";
    private String mae = null;
    private String pai = null;

    public Pessoa(String nome, String mae, String pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public String getMae() {
        return mae;
    }

    public String getPai() {
        return pai;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public boolean igualdadeSemantica() {
        return nome.equals(mae);
    }

    public boolean verificarIrmandade() {

    }
}
