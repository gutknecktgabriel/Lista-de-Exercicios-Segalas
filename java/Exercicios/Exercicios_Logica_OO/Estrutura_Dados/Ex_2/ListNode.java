package Exercicios.Exercicios_Logica_OO.Estrutura_Dados.Ex_2;

public class ListNode<T> {
    T nome;
    ListNode proximo;

    public ListNode(T nome, ListNode proximo) {
        this.nome = nome;
        this.proximo = proximo;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public ListNode getProximo() {
        return proximo;
    }

    public void setProximo(ListNode proximo) {
        this.proximo = proximo;
    }

}
