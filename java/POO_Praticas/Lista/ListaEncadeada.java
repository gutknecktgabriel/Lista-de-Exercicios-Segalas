package POO_Praticas.Lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private String str;
    private final int NAO_ENCONTRADO = -1;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void remove(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho--;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao) {
        if (!(posicao > 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe.");
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();

        }
        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int buscaPorElemento(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;
        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adicionarNaPosicao(int posicao, T elemento) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Impossível adicionar, verifique a posição mencionada ou o tamanho da lista");
        }
        if (posicao == 0) { //lista vazia
            this.adicionaInicio(elemento);
        } else if (posicao == this.tamanho) { // adiciona
            this.adiciona(elemento);
        } else { // adicionar no meio da lista
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia.");
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.ultimo = null;
        }
        return removido;
    }

    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia");
        }
        T removidoUltimo = this.ultimo.getElemento();
        this.ultimo = this.ultimo.getProximo();
        this.tamanho--;

        return removidoUltimo;
    }

    public void removerNaPosicao(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Tem algo de errado");
        }
        if (posicao == 0){
            remove(elemento);
        } else if (posicao == tamanho) {
            remove(elemento);
        }

    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder(str = "[");
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(str = ",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append(str = "]");
        return builder.toString();
    }
}
