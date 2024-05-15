package POO_Praticas.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericsTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;


        //LISTA DO TIPO STRING
        List<Integer> lista = new ArrayList<>();
        lista.add(1343);
        lista.add(2434);
        lista.add(345);

        for (Integer i : lista){
            total += i;
        }
        System.out.println(total);
    }
}