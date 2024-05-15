package Exercicios.Exercicios_Logica_OO.Heranca_Polimofirmos.Medidas_Poligonos;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoPoligono;

        System.out.println("Qual o tipo de polígono que você deseja criar? ");
        System.out.println("Opções disponíveis: Poligono regular, triangulo ou quadrado");
        tipoPoligono = scanner.next().toLowerCase();

        switch (tipoPoligono) {
            case "poligono":
                System.out.println("Quantos lados tem seu polígono regular?");
                int numLados = scanner.nextInt();
                System.out.println("Qual o tamanho dos lados?");
                int tamanhoLadoRegular = scanner.nextInt();
                PolReg regular = new QuadradoEq(numLados, tamanhoLadoRegular);

                System.out.println("Tamanho do perimetro: " + regular.calculoPerimetro());
                System.out.println("Valor do ângulo interno: " + regular.calculaAngulo());
                break;
            case "triangulo":

                System.out.println("Qual o tamanho dos lados do triângulo?");
                int tamanhoLadoTriangulo = scanner.nextInt();
                PolReg triangulo = new TrianguloEq(3, tamanhoLadoTriangulo);

                System.out.println("Tamanho do perimetro: " + triangulo.calculoPerimetro());
                System.out.println("Tamanho do ângulo interno: " + triangulo.calculaAngulo());
                break;
            case "quadrado":
                System.out.println("Qual o tamanho dos lados do seu quadrado?");
                int tamanhoLadoQuadrado = scanner.nextInt();
                PolReg quadrado = new QuadradoEq(4, tamanhoLadoQuadrado);

                System.out.println("Tamanho do perimetro: " + quadrado.calculoPerimetro());
                System.out.println("Tamanho do ângulo interno: " + quadrado.calculaAngulo());
                break;
        }
    }
}
