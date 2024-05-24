package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_2;

public class ListOperation<T> {
    ListNode<T> primeiro;
    ListNode<T> ultimo;

    public void add(ListNode n, ListNode ant) {
        if (ant == null) {
            n.proximo = null;
        } else {
            n.proximo = ant.proximo;
            ant.proximo = n;
        }
    }

    public void remove(ListNode n) {
        remove(n);
    }

    public void print() {
        String result = " ";
        ListNode<T> nome = null;
        while (nome.proximo != null){
            result += nome;
        }
        System.out.println(result);
    }
}


