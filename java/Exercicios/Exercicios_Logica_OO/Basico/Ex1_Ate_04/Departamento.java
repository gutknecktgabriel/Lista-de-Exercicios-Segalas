package Exercicios.Exercicios_Logica_OO.Basico.Ex1_Ate_04;

public class Departamento {
    String nomeDepartamento;
    Universidade universidade;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;

    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;

    }

    public Universidade getUniversidade() {
        return universidade;

    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;

    }
}

