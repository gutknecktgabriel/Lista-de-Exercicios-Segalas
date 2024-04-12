package Exercicios.Exercicios_Logica_OO.Array;

public class Exercicio_9_Array {
    int[] arrayDeInteiro;
    int valorAtual;
    int valorMaximo;
    int posicaoAtual;

    public void Exercicio_9_Array(int valorMaximo) {

        this.arrayDeInteiro = new int[valorMaximo];
        this.valorAtual = 0;
        this.posicaoAtual = arrayDeInteiro.length -1;
        this.valorMaximo = valorMaximo;

    }

    public boolean adicionar(int number) {
        if (posicaoAtual > valorMaximo){
            return false;
        }
        else {
            valorAtual = number;
            arrayDeInteiro[posicaoAtual] = valorAtual;
            posicaoAtual --;
            return true;
        }
    }
    public int calculoMedia(int caluloMedia){

        return caluloMedia = valorAtual + valorMaximo / 2;
    }
}
