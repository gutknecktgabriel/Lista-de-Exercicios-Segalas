package Exercicios.Exercicios_Fixacao2.Ex2;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(2,6);
        Ponto2D p2 = new Ponto2D(3,4);

        System.out.println("Ponto P1: " + p1);
        System.out.println("Ponto P2: " + p2);

        System.out.println("Distância entre os pontos P1 e P2: " + p1.calcularDistancia(p2));

        p1.moverPontos(5, 6);
        System.out.println("Ponto 1 movido! localização atual: " + p1);

        Ponto2D p3 = p1.clone();
        System.out.println("Clone do Ponto 1: " + p3);

        System.out.println("O clone é igual ao Ponto 1? " + p1.equals(p3));
    }
}

