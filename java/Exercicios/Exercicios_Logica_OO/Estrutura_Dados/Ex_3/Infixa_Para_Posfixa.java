package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_3;

public class Infixa_Para_Posfixa<T> {
    private T[] info;
    private int limitePilha;
    private int tamanhoMax;

    public Infixa_Para_Posfixa(int limitePilha) {
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
        if (tamanhoMax <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public T peek() {
        T valor;
        valor = peek();
        tamanhoMax = tamanhoMax + 1;
        return valor;

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
}
