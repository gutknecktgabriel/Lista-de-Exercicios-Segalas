package Exercicios.Exercicios_Fixacao2.Ex5;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5, 2, 3);
        System.out.println(circulo);

        circulo.inflar();
        System.out.println("Após de inflar: " + circulo);

        circulo.desinflar(1);
        System.out.println("Após desinflar: " + circulo);

        circulo.mover();
        System.out.println("Após mover para a origem: " + circulo);

        circulo.mover(86, 22);
        System.out.println("Após mover para 86 e 22): " + circulo);

        Circulo circulo2 = new Circulo(4);
        circulo.mover(circulo2);
        System.out.println("Após mover para a posição do circulo 2: " + circulo);
    }
}