package Exercicios.Exercicios_Logica_OO.Array;

import java.util.ArrayList;

public class Exerc_10 {
    private ArrayList<Integer> valores;
    private int posicaoAtual;
    private int valorMaximo;
    private int valorAtual;
    private int valorTotal;
    private int calculoMedia = 0;


    public Exerc_10(int valorMaximo) {

        this.valores = new ArrayList<>();
        this.valorMaximo = valorMaximo;
        this.posicaoAtual = valores.toArray().length;
        this.valorAtual = 0;
    }

    public boolean adicionar(int number) {

        if (posicaoAtual > valorMaximo) {
            return false;
        } else {
            valorAtual = number;
            valores.set(posicaoAtual, valorAtual);
            posicaoAtual--;
            return true;
        }
    }

    public int calculoMedia() {
        for (int i = 0; i < valores.toArray().length; i++) {
            valorTotal += valores.get(i);

        }
        calculoMedia = valorTotal / valores.length;
        return calculoMedia;
    }
}



