package POO.Classes_Utilitarias;

import java.io.IOException;

public class File {
    public static void main(String[] args) {
         java.io.File file = new java.io.File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
