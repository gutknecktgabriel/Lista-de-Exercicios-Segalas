package Exercicios.Exercicios_Fixacao2.Ponto2D;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(2,6);
        Ponto2D p2 = new Ponto2D(3,4);
        Ponto2D p3 = new Ponto2D(1,5);

        System.out.println("Ponto P1: " + p1);
        System.out.println("Ponto P2: " + p2);
        System.out.println("Ponto P3: " + p3);

        System.out.println("Distância entre os pontos P2 e P3: " + p2.calcularDistancia(p3));

        p1.moverPontos(5, 6);
        System.out.println("Ponto 1 movido: " + p1);

        Ponto2D p4 = p1.clone();
        System.out.println("Clone de Ponto 1: " + p4);

        System.out.println("Ponto 1 é igual ao clone? " + p1.equals(p4));
    }
}

