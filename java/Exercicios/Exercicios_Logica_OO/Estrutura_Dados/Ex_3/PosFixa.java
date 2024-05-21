package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

import java.util.Stack;

public class PosFixa {
    public static void main(String[] args) {
        Stack pilha = new Stack<>();
        Infixa infixa = new Infixa("a + b - c * d / e");
        pilha.add(infixa.getExpressaoAritmetica());


    }
}
