package POO_Praticas.Lista.Teste;

import POO_Praticas.Lista.ListaEncadeada;

public class Principal {
    public static void main(String[] args) {
//        testesIniciais();
//        adicionaInicio();
//        adicionaNaPosicao();
//        removeInicio();
//        removeFinal();
        removerNaPosicao();

    }

    public static void adicionaNaPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(6);

        lista.adicionarNaPosicao(2, 4);


        System.out.println(lista);

    }


    public static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }

    public static void removeInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista atualizada após a remoção do elemento: " + lista);
    }

    public static void removeFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista atualizada após a remoção: " + lista);

    }
    public static void removerNaPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println("Lista antiga: " + lista);

        lista.removerNaPosicao(0,2);
        System.out.println("Lista atualizada: " + lista);
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

