package Exercicios.Exercicios_Logica_OO.DesafioLogica;

import java.util.Scanner;

import static Exercicios.Exercicios_Logica_OO.DesafioLogica.BookRepository.addBook;
import static Exercicios.Exercicios_Logica_OO.DesafioLogica.BookRepository.livros;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookRepository repository = new BookRepository();

        String pesquisaDeLivro = null;

        int adicionarLivrosQnt = 0;

        Livro livro1 = new Livro();

        System.out.printf("Informe quantos livros você deseja cadastrar: ");
        adicionarLivrosQnt = scanner.nextInt();

        for (int i = 0; i < adicionarLivrosQnt; i++) {
            System.out.println("Qual o código do livro: ");
            String codigo = scanner.next();
            livro1.setCodLivro(codigo);

            System.out.println("Qual o nome do livro: ");
            String tituloLivro = scanner.next();
            livro1.setTituloLivro(tituloLivro);


            System.out.println("QUal o autor do livro: ");
            String autorLivro = scanner.next();
            livro1.setAutor(autorLivro);


            System.out.println("Qual o ano de publicação do livro? ");
            int anoPublicacao = scanner.nextInt();
            livro1.setAnoPublicacao(anoPublicacao);
            scanner.nextLine();


            BookRepository.addBook(livro1);
        }
        while (true) {
            System.out.println("Qual livro você deseja buscar na bibilioteca? ");
            String codigoPesquisa = scanner.next();
            if (codigoPesquisa.equals("fim")) {
                System.out.println("Programa sendo encerrado...");
                break;
            }
            repository.searchLivrobyCode(codigoPesquisa);
            try {
                String livroEncontrado = repository.searchLivrobyCode(pesquisaDeLivro);
                livro1.exibirInfo();
            } catch (LivroNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



