package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

import java.util.HashMap;
import java.util.Map;


public class Infixa<T> {
    private T[] info;
    private int limitePilha;
    private int tamanhoMax;


    public Infixa() {
        info = (T[]) new Object[limitePilha];
        this.limitePilha = limitePilha;
        this.tamanhoMax = 10000;
    }

    public void add(T valor) {
        if (tamanhoMax > limitePilha) {
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

    private static Map<String, Integer> precedencia = new HashMap<>();

    static {
        precedencia.put("+", 1);
        precedencia.put("-", 1);
        precedencia.put("*", 2);
        precedencia.put("/", 2);
        precedencia.put("(", 0);
    }

    public String conversao(String expressaoInfixa) {
        StringBuilder resultado = new StringBuilder();
        Infixa<String> pilha = new Infixa<>();
        String[] tokens = expressaoInfixa.split("");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                resultado.append(token).append(" ");
            } else if (token.equals(")")) {
                while (!pilha.isEmpty(true) && pilha.peek().equals("(")) {
                    resultado.append(pilha.pop()).append(" ");
                }
                pilha.pop();
            } else {
                while (!pilha.isEmpty(true) && precedencia.get(token) <= precedencia.get(token)) {
                    resultado.append(pilha.pop()).append(" ");
                }
            }

        }
        return null;
    }
}