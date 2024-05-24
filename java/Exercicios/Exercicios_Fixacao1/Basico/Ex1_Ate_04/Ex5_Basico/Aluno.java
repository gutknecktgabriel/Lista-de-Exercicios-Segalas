package Exercicios.Exercicios_Logica_OO.Basico.Ex1_Ate_04.Ex5_Basico;

import java.util.ArrayList;

public class Aluno {

    ArrayList<Aluno> alunos = new ArrayList<>();


    private String nomeAluno;
    private int primeiraNotaParcial;
    private int segundaNotaParcial;

    public Aluno() {
    }

    public Aluno(String nomeAluno, int primeiraNotaParcial, int segundaNotaParcial) {
        this.nomeAluno = nomeAluno;
        this.primeiraNotaParcial = primeiraNotaParcial;
        this.segundaNotaParcial = segundaNotaParcial;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
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
}