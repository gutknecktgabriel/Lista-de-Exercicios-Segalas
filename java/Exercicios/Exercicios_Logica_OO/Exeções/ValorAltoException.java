package Exercicios.Exercicios_Logica_OO.Exeções;

public class ValorAltoException extends RuntimeException {
    public String getMessage() {
        return ("Valor muito alto, tente um valor menor.");

    }
}

