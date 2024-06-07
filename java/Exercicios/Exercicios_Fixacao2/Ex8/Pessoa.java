package Exercicios.Exercicios_Fixacao2.Ex8;

import java.util.ArrayList;

public class Pessoa extends ArrayList {
    private String nome;
    private String mae;
    private String pai;

    public Pessoa(String nome, String mae, String pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public Pessoa(String nome) {
        this(nome, null, null);
    }
}


