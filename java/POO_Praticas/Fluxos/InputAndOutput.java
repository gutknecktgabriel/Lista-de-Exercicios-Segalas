package POO_Praticas.Fluxos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput {
    public static void main(String[] args) {
        leitor();
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};

        try (FileOutputStream gravador = new FileOutputStream("pastaStream.txt", true)) {
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void leitor(){
        try (FileInputStream leitor = new FileInputStream("pastaStream.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1){
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
