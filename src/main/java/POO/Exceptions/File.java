package POO.Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        java.io.File file = new java.io.File("C:\\temp\\in.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file " + e.getMessage());
        }
        finally {
            if (null != scanner){
                scanner.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
