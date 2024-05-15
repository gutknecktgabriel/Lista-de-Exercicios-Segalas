package Exercicios.Exercicios_Logica_OO.Array;

public class Exercicio_9_Array {
    int[] arrayDeInteiro;
    int valorAtual;
    int valorMaximo;
    int posicaoAtual;
    int valorTotal;
    int caluloMedia = 0;

    public Exercicio_9_Array(int valorMaximo) {


        this.arrayDeInteiro = new int[valorMaximo];
        this.valorMaximo = valorMaximo;
        this.posicaoAtual = arrayDeInteiro.length - 1;
        this.valorAtual = 0;

    }

    public boolean adicionar(int number) {
        if (posicaoAtual > valorMaximo) {
            return false;
        } else {
            valorAtual = number;
            arrayDeInteiro[posicaoAtual] = valorAtual;
            posicaoAtual--;
            return true;
        }
    }

    public int calculoMedia() {

        for (int i = 0; i < arrayDeInteiro.length; i++) {
            valorTotal += arrayDeInteiro[i];

        }
        caluloMedia = valorTotal / arrayDeInteiro.length;
        return caluloMedia;
    }
}
