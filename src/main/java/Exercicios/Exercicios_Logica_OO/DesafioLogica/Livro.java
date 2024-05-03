package Exercicios.Exercicios_Logica_OO.DesafioLogica;

public class Livro {
    String codLivro;
    String tituloLivro;
    String autor;
    int anoPublicacao;

    public Livro(String codLivro, String tituloLivro, String autor, int anoPublicacao) {
        this.codLivro = codLivro;
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public void exibirInfo() {
        System.out.println("Código do livro: " + codLivro);
        System.out.println("Titulo do livro: " + tituloLivro);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }

    public Livro() {
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}


