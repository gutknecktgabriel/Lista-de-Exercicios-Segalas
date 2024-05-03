package Exercicios.Exercicios_Logica_OO.DesafioLogica;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookRepository repository = new BookRepository();

        int adicionarLivrosQnt = 0;
        String tituloLivro;
        String codigo;
        String autorLivro;
        int anoPublicacao;

        System.out.printf("Informe quantos livros você deseja cadastrar: ");
        adicionarLivrosQnt = scanner.nextInt();

        for (int i = 0; i < adicionarLivrosQnt; i++) {
            Livro livro1 = new Livro();
            System.out.println("Qual o código do livro: ");
            codigo = scanner.next();
            livro1.setCodLivro(codigo);
            scanner.nextLine();

            System.out.println("Qual o nome do livro: ");
            tituloLivro = scanner.next();
            livro1.setTituloLivro(tituloLivro);
            scanner.nextLine();

            System.out.println("Qual o autor do livro: ");
            autorLivro = scanner.next();
            livro1.setAutor(autorLivro);
            scanner.nextLine();

            System.out.println("Qual o ano de publicação do livro? ");
            anoPublicacao = scanner.nextInt();
            livro1.setAnoPublicacao(anoPublicacao);
            scanner.nextLine();


            repository.addBook(livro1);

        }

        while (true) {
            System.out.println("Qual livro você deseja buscar na bibilioteca? ");
            String codigoPesquisa = scanner.next();
            if (codigoPesquisa.equals("fim")) {
                System.out.println("Programa sendo encerrado...");
                break;
            }
            repository.searchLivrobyCode(codigoPesquisa);

        }
    }
}



