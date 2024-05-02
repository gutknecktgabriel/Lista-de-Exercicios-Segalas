package Exercicios.Exercicios_Logica_OO.DesafioLogica;

import java.util.HashMap;

public class BookRepository {

    static HashMap<String, Livro> livros;
    public BookRepository() {
        livros = new HashMap<>();
    }

    //Metodo para adicionar livros usando o codigo como chave
    public static void addBook(Livro livro) {
        livros.put(livro.getCodLivro(), livro);

    }
    //Buscar livro por codigo
    public String searchLivrobyCode(String codLivro) throws LivroNaoEncontradoException {
        String livro = codLivro;
        if (livro == null) {
            throw new LivroNaoEncontradoException();
        }
        return livro;
    }
}
