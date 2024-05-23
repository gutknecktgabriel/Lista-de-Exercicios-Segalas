package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

import java.util.HashMap;

public class Infixa<T> {
    private T[] info;
    private int limitePilha;
    private int tamanhoMax;
    String contaMatematica = "( 96 + 3 ) * 89 / 5";

    public Infixa() {
        info = (T[]) new Object[limitePilha];
        this.limitePilha = limitePilha;
        this.tamanhoMax = 10000;
    }

    public void add(T valor) {
        if (limitePilha > tamanhoMax) {
            throw new RuntimeException("Pilha estourada, valor máximo atingido");
        } else {
            info[tamanhoMax] = valor;
            tamanhoMax = tamanhoMax + 1;
        }
    }

    public boolean isEmpty(boolean vazio) {
        return tamanhoMax == 0;
    }

    public T peek() {
        if (isEmpty(true)) {
            throw new RuntimeException("Pilha vazia!");
        }
        return info[tamanhoMax + 1];
    }

    public T pop() {
        T valor;
        valor = pop();
        tamanhoMax = tamanhoMax - 1;
        return valor;
    }

    public int tamanhoMax() {
        return tamanhoMax;
    }

    public static void operators(String infixa) {

        HashMap<String, Integer> operadoresAritmeticos = new HashMap<>();
        operadoresAritmeticos.put("+", 1);
        operadoresAritmeticos.put("-", 1);
        operadoresAritmeticos.put("*", 2);
        operadoresAritmeticos.put("/", 2);
        operadoresAritmeticos.put("(", 0);
    }

    public String conversao(String expressaoInfixa) {
        StringBuilder resultado = new StringBuilder();
        Infixa<String> pilha = new Infixa<>();
        String[] tokens = expressaoInfixa.split(" ");

        for (String token : tokens){

        }
        return expressaoInfixa;
    }
}
