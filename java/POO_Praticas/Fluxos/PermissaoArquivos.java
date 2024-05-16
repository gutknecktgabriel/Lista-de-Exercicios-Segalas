package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.io.File;
import java.io.FileNotFoundException;

public class PermissaoArquivos {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\gabriel.gutkneckt\\IdeaProjects\\SegalasExercicio\\src\\Meu_Novo_Diretorio\\MeuArquivo.txt");

        boolean exists = file.exists();
        if (exists ) {

            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(false);
            System.out.println("Permissões de arquivo alteradas");

            System.out.println("Executable: " + file.canExecute());
            System.out.println("Read: " + file.canRead());
            System.out.println("Write: " + file.canWrite());
        }
    }
}

