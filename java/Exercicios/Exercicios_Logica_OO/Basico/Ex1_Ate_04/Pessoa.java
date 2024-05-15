package Exercicios.Exercicios_Logica_OO.Basico.Ex1_Ate_04;

import java.time.LocalDate;
import java.time.Period;


public class Pessoa {
    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    String nome;
    Universidade universidade;
    Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Pessoa(int idade, int diaNasc, int mesNasc, int anoNasc, String nome, Universidade universidade) {
        this.idade = idade;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nome = nome;
        this.universidade = universidade;
    }

    public Pessoa(int idade, int diaNasc, int mesNasc, int anoNasc) {
        this.idade = idade;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(anoNasc, mesNasc, diaNasc);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        Period periodo = Period.between(dataNascimento, dataAtual); //calcula a duração das datas, desde a data de nascimento ate a data atual
        this.idade = periodo.getYears();    //pega idade da pessoa em anos atraves do periodo
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public Pessoa(int dia, int mes, int ano) {
        this.diaNasc = dia;
        this.mesNasc = mes;
        this.anoNasc = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDiaNasc() {
        return diaNasc;

    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;

    }

    public int getMesNasc() {
        return mesNasc;

    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;

    }

    public int getAnoNasc() {
        return anoNasc;

    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public Universidade getUniversidade() {
        return universidade;

    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;

    }

    public String retornaUniversadeEPessoa() {
        return "O físico " + getNome() + " estudou na universidade de " + getUniversidade().getNome();
    }
}