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
        this(nome, null, null);
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(mae, pessoa.mae);
    }

}


