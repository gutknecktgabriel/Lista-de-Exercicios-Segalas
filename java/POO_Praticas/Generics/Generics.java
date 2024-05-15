package POO_Praticas.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listaDeDouble = new ArrayList<>();

        listaDeDouble.add(23.34);

        List<Integer> listaDeInteiro = new ArrayList<>();
        listaDeInteiro.add(652);

        List<String> listaDeString = new ArrayList<>();

        listaDeString.add("Gabriel");

        System.out.println(listaDeInteiro);
        System.out.println(listaDeString);
        System.out.println(listaDeDouble);

        
    }
}
