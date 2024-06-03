package Exercicios.Exercicios_Fixacao2.Ponto2D;

import java.util.Scanner;

public class Cartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ponto2D ponto = new Ponto2D();

        System.out.print("Informe o valor que deseja aplicar ao X no plano cartesiano: ");
        ponto.setX(scanner.nextDouble());

        System.out.print("Informe o valor que deseja aplicar ao Y no plano cartesiano: ");
        ponto.setY(scanner.nextDouble());


    }
}
