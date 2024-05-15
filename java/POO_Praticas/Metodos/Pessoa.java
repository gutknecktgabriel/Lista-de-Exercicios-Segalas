package POO_Praticas.Metodos;

public class Pessoa {


    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    ///Getter
    public int getIdade() {
        return idade;
    }

    //Setter
    public void setIdade(int novaIdade) {
        if (novaIdade >= 00 && novaIdade <= 120)
            this.idade = novaIdade;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sou o " + getNome() + " tenho " + getIdade() + " anos";
    }
}