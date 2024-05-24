package Exercicios.Exercicios_Logica_OO.Basico.Ex1_Ate_04;

import java.util.ArrayList;

public class Universidade extends ArrayList<Departamento> {
    String nome;
    Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;

    }

    public Universidade(String nome) {
        this.nome = nome;

    }

    public Universidade() {
    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

}
