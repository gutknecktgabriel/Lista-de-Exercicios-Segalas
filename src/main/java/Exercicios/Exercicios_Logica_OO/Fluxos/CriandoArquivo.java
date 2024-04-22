package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.io.File;
import java.io.IOException;

public class CriandoArquivo {
    public static void main(String[] args) {
        try {
            File file = new File("criandoArquivo.txt");
            if (file.createNewFile()){
                System.out.println("Arquivo criado: " + file.getName());
            }
            else {
                System.out.println("Arquivo já existente.");
            }
        } catch (IOException e) {
            System.out.println("Um erro aconteceu: ");
            e.printStackTrace();
        }
    }
}
