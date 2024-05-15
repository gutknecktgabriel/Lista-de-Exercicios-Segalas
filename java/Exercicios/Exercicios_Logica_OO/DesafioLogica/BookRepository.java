package Exercicios.Exercicios_Logica_OO.DesafioLogica;

import java.util.HashMap;

public class BookRepository {

    HashMap<String, Livro> livros = new HashMap<>();

    public void addBook(Livro livro)  {
        try {
            if (livros.containsKey(livro.getCodLivro())) {
                throw new IllegalArgumentException();
            } else {
                livros.put(livro.getCodLivro(), livro);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Código já utilizado, por favor tente outro, cada código é exclusivo");
        }
    }

    //Buscar livro por codigo
    public String searchLivrobyCode(String codLivro) {
        try {
            if (livros.containsKey(codLivro)) {
                livros.get(codLivro).exibirInfo();
            } else {
                throw new LivroNaoEncontradoException();
            }
        } catch (LivroNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}