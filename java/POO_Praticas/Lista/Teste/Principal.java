package POO_Praticas.Lista.Teste;

import POO_Praticas.Lista.ListaEncadeada;

public class Principal {
    public static void main(String[] args) {
//        testesIniciais();
//        adicionaInicio();
        adicionaNaPosicao();
    }

    public static void adicionaNaPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);

        lista.adicionarNaPosicao(0,0);
        lista.adicionarNaPosicao(4,5);
        lista.adicionarNaPosicao(2,3);

        System.out.println(lista);

    }


    public static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }


    public static void testesIniciais() {

        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.adiciona(1);
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.adiciona(4);
        System.out.println(lista);

        lista.adiciona(5);
        System.out.println(lista);

        lista.adiciona(6);
        System.out.println(lista);

        System.out.println("--------------------------------------------------------------");

        System.out.println("Busca por elemento: ");
        System.out.println(lista.buscaPorElemento(1));
        System.out.println(lista.buscaPorElemento(2));
        System.out.println(lista.buscaPorElemento(3));

        System.out.println("--------------------------------------------------------------");
        System.out.println("Busca por posição: ");
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(3));

    }

}

