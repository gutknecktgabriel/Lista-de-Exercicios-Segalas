package Exercicios.Exercicios_Fixacao2.Ex4;

public class Main {
    public static void main(String[] args) {
        Reta reta1 = new Reta(2, 3);
        Reta reta2 = new Reta(1, 5, 3, 9);

        System.out.println("Reta 1: " + reta1);
        System.out.println("Reta 2: " + reta2);

        Reta interseccaoReta = new Reta(1, 2);
        Reta outraReta = new Reta(3, -4);

        Reta.Ponto pontoInterseccao = interseccaoReta.interseccao(outraReta);
        if (pontoInterseccao != null) {
            System.out.println("Ponto de interseção: " + pontoInterseccao);
        } else {
            System.out.println("As retas são paralelas, portanto, não existe ponto de interseção.");
        }
    }
}

