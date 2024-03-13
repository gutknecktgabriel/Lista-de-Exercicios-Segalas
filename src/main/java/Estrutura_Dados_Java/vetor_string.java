package Estrutura_Dados_Java;

import java.util.Scanner;

public class vetor_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "RN";
        estados[2] = "SP";
        estados[3] = "CE";
        estados[4] = "PA";
        estados[5] = "AM";
        estados[6] = "AP";
        estados[7] = "PB";
        estados[8] = "SC";
        estados[9] = "BA";

        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ": " + estados[i]);
        }
        Scanner scanner_1 = new Scanner(System.in);
        System.out.println("Qual sigla de estado você deseja buscar? ");
        String siglaBusca = scanner.nextLine();

        String elementos;
        boolean encontrou = false;

        for (int i = 0; i < estados.length; i++) {
            elementos = estados[i];
            if (elementos.equalsIgnoreCase(siglaBusca)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true){
            System.out.println("ACHOU");
        }
        else {
            System.out.println("Nao encontrou");
        }
    }
}
