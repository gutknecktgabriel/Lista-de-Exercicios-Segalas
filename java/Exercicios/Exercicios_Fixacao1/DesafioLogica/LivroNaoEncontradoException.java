package Exercicios.Exercicios_Logica_OO.DesafioLogica;

public class LivroNaoEncontradoException extends Throwable {
    public String getMessage() {

        return ("ERRO: Livro não encontrado dentro de nosso sistema");
    }
}
