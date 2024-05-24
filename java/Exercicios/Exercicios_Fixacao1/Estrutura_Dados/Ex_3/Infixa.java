package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

import java.util.HashMap;
import java.util.Map;

public class Infixa<T> {
    private T[] info;
    private int limitePilha;
    private int tamanhoMax;

    public Infixa(int limitePilha) {
        info = (T[]) new Object[limitePilha];
        this.limitePilha = limitePilha;
        this.tamanhoMax = 0;
    }

    public void add(T valor) {
        if (tamanhoMax >= limitePilha) {
            throw new RuntimeException("Pilha estourada, valor máximo atingido");
        } else {
            info[tamanhoMax] = valor;
            tamanhoMax = tamanhoMax + 1;
        }
    }

    public boolean isEmpty() {
        return tamanhoMax == 0;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return info[tamanhoMax - 1];
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        T valor = info[tamanhoMax - 1];
        tamanhoMax = tamanhoMax - 1;
        return valor;
    }

    public int tamanho() {
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

    public String converterParaPosfixa(String expressaoInfixa) {
        StringBuilder resultado = new StringBuilder();
        Infixa<String> pilha = new Infixa<>(expressaoInfixa.length());
        String[] tokens = expressaoInfixa.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                resultado.append(token).append(" ");
            } else if (token.equals("(")) {
                pilha.add(token);
            } else if (token.equals(")")) {
                while (!pilha.isEmpty() && !pilha.peek().equals("(")) {
                    resultado.append(pilha.pop()).append(" ");
                }
                pilha.pop();
            } else {
                while (!pilha.isEmpty() && precedencia.get(token) <= precedencia.get(pilha.peek())) {
                    resultado.append(pilha.pop()).append(" ");
                }
                pilha.add(token);
            }
        }

        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop()).append(" ");
        }

        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        Infixa<String> infixaParaPosfixa = new Infixa<>(100);
        String expressaoMatematica = "3 + 4 * 2 / ( 1 - 5 )";
        String expressaoPosfixa = infixaParaPosfixa.converterParaPosfixa(expressaoMatematica);
        System.out.println("Expressão Posfixa: " + expressaoPosfixa);
    }
}