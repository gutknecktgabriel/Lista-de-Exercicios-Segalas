package POO_Praticas.ServerSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerSocketTeste {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket server = new ServerSocket(3322);
            System.out.println("Servidor iniciado na porta 3322");

            Socket cliente = server.accept();
            System.out.println("Cliente conectado do IP " + cliente.getInetAddress().getHostAddress());

            Scanner scanner = new Scanner(cliente.getInputStream());

            while (scanner.hasNextLine()){
                System.out.println(scanner.hasNextLine());
            }
            scanner.close();
            server.close();

        } catch (IOException e) {
            Logger.getLogger(ServerSocket.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
