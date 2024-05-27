package POO_Praticas.Lista.Teste;

import POO_Praticas.Lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.adiciona(1);
        lista.adiciona(2);

        System.out.println(lista);

    }
}
