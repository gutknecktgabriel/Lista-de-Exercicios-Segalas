package POO_Praticas.Fluxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTXT {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("c:\\temp\\testeDoFileAbrir.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Ocorreu um erro ao tentar visualizar o arquivo: " + e.getMessage());
        }
    }
}
