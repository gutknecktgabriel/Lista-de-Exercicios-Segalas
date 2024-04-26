package Exercicios.Exercicios_Logica_OO.Fluxos;

public class EspecificacoesAlunos {
    private String nomeAluno;
    private Integer codigoAluno;
    private Integer notaAluno;

    public EspecificacoesAlunos(String nomeAluno, Integer codigoAluno, Integer notaAluno) {
        this.nomeAluno = nomeAluno;
        this.codigoAluno = codigoAluno;
        this.notaAluno = notaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Integer getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(Integer notaAluno) {
        this.notaAluno = notaAluno;
    }
}
