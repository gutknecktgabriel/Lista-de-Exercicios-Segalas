package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Manipulando_Arquivo_Binario {
    public static void main(String[] args) throws Exception {

            String pathIn = "C:\\Users\\gabriel.gutkneckt\\IdeaProjects\\SegalasExercicio\\src\\2014-11-14-java-logo.webp";
            String pathOut = "C:\\Users\\gabriel.gutkneckt\\IdeaProjects\\SegalasExercicio\\src\\2014-11-14-java-logo.webp-2.jpg";

            int read = 0;
            byte[] length = new byte[1024];

            try(InputStream in = new FileInputStream(pathIn); OutputStream out = new FileOutputStream(pathOut)) {

            while ((read = in.read(length))!= -1){
                out.write(length, 0, read);

            }
                System.out.println("Processo finalizado");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
