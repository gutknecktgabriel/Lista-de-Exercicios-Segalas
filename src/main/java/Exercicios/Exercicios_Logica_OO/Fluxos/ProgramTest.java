package Exercicios.Exercicios_Logica_OO.Fluxos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = scanner.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean sucess = new File(sourceFolderStr + "out\\").mkdir();
        System.out.println("Folder created: " + sucess);

        String targetFileStr = sourceFolderStr + "out\\summary.csv";

        scanner.close();
    }
}
