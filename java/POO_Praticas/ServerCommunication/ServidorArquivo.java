package POO_Praticas.ServerCommunication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorArquivo {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Informe a porta a ser ouvida pelo servidor");
            System.exit(0);
        }
        try {
            int port = Integer.parseInt(args[0]);
            System.out.println("Inicializando o servidor...");
            ServerSocket serv = new ServerSocket(port);
            System.out.println("Servidor inicializado, ouvindo a porta: " + port);
            // Aguarda conexões
            while (true) {
                Socket clie = serv.accept();
                // Inicia thread do cliente
//                new ThreadClie(clie).start();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
