package Exercicios.Exercicios_Logica_OO.DesafioLogica;

import java.util.HashMap;

public class BookRepository {

    HashMap<String, Livro> livros;

    public BookRepository() {
        livros = new HashMap<>();
    }
    //Metodo para adicionar livros usando o codigo como chave
    public void addBook(Livro livro) {
        livros.put(livro.getCodLivro(), livro);
    }

    //Buscar livro por codigo
    public String buscarLivro(String codLivro) throws LivroNaoEncontradoException {
        String livro = codLivro;
        if (livro == null) {
            throw new LivroNaoEncontradoException();
        }
        return livro;
    }
}
