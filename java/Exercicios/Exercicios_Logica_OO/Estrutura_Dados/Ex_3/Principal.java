package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

public class Principal<S> {
    public static void main(String[] args) {
        String contaMatematica = "( 96 + 3 ) * 89 / 5";
        System.out.println(contaMatematica);
    }

    public static Infixa_Para_Posfixa<String> converter(String infixa) {
        String vetorCharInfixa[] = infixa.split(" ");
        Principal<String> pilha = new Principal<>();
        Principal<String> posFixo = new Principal<>();

        System.out.println("Tamanho da conta: " + infixa.length());
        int contagem = 0;
        int topoDaPilha = 0;
        String opcoesDeOperacoes = null;

        while (contagem < vetorCharInfixa.length) {
            switch (opcoesDeOperacoes) {
                case "+":
                case "-":
                case "*":
                case "/":
            }

        }
        return null;
    }
}

