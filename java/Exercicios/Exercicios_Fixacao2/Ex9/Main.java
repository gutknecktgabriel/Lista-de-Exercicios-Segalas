package Exercicios.Exercicios_Fixacao2.Ex9;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();

        conjunto1.adicionar("A");
        conjunto1.adicionar("B");
        conjunto1.adicionar("C");

        conjunto2.adicionar("B");
        conjunto2.adicionar("C");
        conjunto2.adicionar("D");

        System.out.println("Conjunto 1:");
        conjunto1.exibir();

        System.out.println("Conjunto 2:");
        conjunto2.exibir();

        Conjunto uniao = conjunto1.uniao(conjunto2);
        System.out.println("União:");
        uniao.exibir();

        Conjunto interseccao = conjunto1.inter(conjunto2);
        System.out.println("Interseção:");
        interseccao.exibir();

        Conjunto diferenca = conjunto1.menos(conjunto2);
            System.out.println("Diferença:");
            diferenca.exibir();
    }
}
