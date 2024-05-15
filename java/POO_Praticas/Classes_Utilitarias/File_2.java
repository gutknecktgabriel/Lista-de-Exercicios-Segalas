package POO_Praticas.Classes_Utilitarias;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class File_2 {
    public static void main(String[] args) {

        File file = new File("Teste de File.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Path " + file.isFile());
            System.out.println("last mofied " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}