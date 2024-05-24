package Exercicios.Exercicios_Logica_OO.Exeções;

public class ValorBaixoException extends RuntimeException{
    public String getMessage() {
        return ("Valor baixo demais, tente um valor maior.");
    }
}
