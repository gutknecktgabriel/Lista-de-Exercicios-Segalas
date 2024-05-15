package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TreinoComFileReader {
    public static void main(String[] args) throws IOException {

        String path = "c:\\temp\\testeDoFileAbrir.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);


            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }finally {
            if (br != null){
                br.close();
            }
            if (fr != null){
                fr.close();
            }
        }
    }
}
