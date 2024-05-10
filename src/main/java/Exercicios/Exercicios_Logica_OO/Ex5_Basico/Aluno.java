package Exercicios.Exercicios_Logica_OO.Ex5_Basico;

public class Aluno {
    private String nome;
    private int primeiraNotaParcial;
    private int segundaNotaParcial;

    public Aluno(String nome, int primeiraNotaParcial, int segundaNotaParcial) {
        this.nome = nome;
        this.primeiraNotaParcial = primeiraNotaParcial;
        this.segundaNotaParcial = segundaNotaParcial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrimeiraNotaParcial() {
        return primeiraNotaParcial;
    }

    public void setPrimeiraNotaParcial(int primeiraNotaParcial) {
        this.primeiraNotaParcial = primeiraNotaParcial;
    }

    public int getSegundaNotaParcial() {
        return segundaNotaParcial;
    }

    public void setSegundaNotaParcial(int segundaNotaParcial) {
        this.segundaNotaParcial = segundaNotaParcial;
    }

    public int setPrimeiraNotaParcial() {
        return primeiraNotaParcial;
    }
}
