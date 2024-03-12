package Estrutura_Dados_Java;

import java.util.Scanner;

public class estrutura_dados_vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //VETOR
        int [] vetor = new int [15];
        vetor [0] = 3;
        vetor [1] = 3;
        vetor [2] = 2;
        vetor [3] = 6;
        vetor [4] = 23;
        vetor [4] = 21;
        vetor [5] = 55;
        vetor [6] = 4;
        vetor [7] = 6;
        vetor [8] = 5;
        vetor [9] = 6;

        for (int i = 0; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
        }
    }
}
