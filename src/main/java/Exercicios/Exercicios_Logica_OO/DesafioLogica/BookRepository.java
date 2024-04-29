package Exercicios.Exercicios_Logica_OO.DesafioLogica;

import java.util.HashMap;

public class BookRepository {

    HashMap<String, Livro> livro = new HashMap<String, Livro>();

    //Metodo para adicionar livros usando o codigo como chave

    public void addBook(Livro livro) {
        try {
            if (livro.getCodLivro() != null) {
                System.out.println(livro.getCodLivro().contains(livro.codLivro));

            }
        } catch (LivroNaoEncontradoException e) {
            return;
        }

    }
}