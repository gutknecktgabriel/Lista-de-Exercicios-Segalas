package Exercicios.Exercicios_Logica_OO.Repeticao;

import java.io.File;

public class PermissãoDeArquivo {
    // Main class

        // Main driver method
        public static void main(String[] args)
        {

            // Creating a file by
            // creating object of File class
            File file
                    = new File("c:\\temp\\testeDoFileAbrir.txt");

            // Checking if the file exists
            // using exists() method of File class
            boolean exists = file.exists();
            if (exists == true) {

                // Printing the permissions associated
                // with the file
                System.out.println("Executable: "
                        + file.canExecute());
                System.out.println("Readable: "
                        + file.canRead());
                System.out.println("Writable: "
                        + file.canWrite());
            }

            // If we enter else it means
            // file does not exists
            else {
                System.out.println("File not found.");
            }
        }
    }
