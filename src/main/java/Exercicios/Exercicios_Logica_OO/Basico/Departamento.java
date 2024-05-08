package Exercicios.Exercicios_Logica_OO.Basico;

public class Departamento {
    String nomeApartamento;
    Universidade universidade;

    public Departamento(String nomeApartamento) {
        this.nomeApartamento = nomeApartamento;
    }

    public String getNomeApartamento() {
        return nomeApartamento;
    }

    public void setNomeApartamento(String nomeApartamento) {
        this.nomeApartamento = nomeApartamento;
    }
    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}

