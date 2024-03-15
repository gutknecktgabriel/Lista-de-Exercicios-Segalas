package Estrutura_Dados_Java;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {


    //Conjunto de bolas
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.forEach(System.out::println);


    }



    record Ball (String color){}
}
