package Exercicios.Exercicios_Fixacao2.Ex1;

public class Principal {
    public static void main(String[] args) {

        Contador contador = new Contador();

        System.out.println("Valor do contador: " + contador.getValor());

        contador.incrementar();
        System.out.println("Contador com valor incrementado: " + contador.getValor());

        contador.zerar();
        System.out.println("Contador zerado: " + contador.getValor());

        System.out.println("Retornando valor do contador: " + contador.retornarValor());
    }
}
