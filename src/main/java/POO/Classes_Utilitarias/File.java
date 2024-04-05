package POO.Classes_Utilitarias;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class File {
    public static void main(String[] args) {
         java.io.File file = new java.io.File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path" + file.getPath());
            System.out.println("path" + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("path" + file.isFile());
            System.out.println("last mofied " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
