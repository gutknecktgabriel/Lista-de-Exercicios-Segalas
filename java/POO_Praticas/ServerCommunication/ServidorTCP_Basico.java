package POO_Praticas.ServerCommunication;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class ServidorTCP_Basico {
    public static void main(String[] args) throws UnknownHostException {
        try {
            ServerSocket server = new ServerSocket(4578);
            System.out.println("Server iniciado na porta: 4578");
            while (true){
                Socket cliente = server.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new Date());
                saida.close();
                cliente.close();
            }
        }
        catch (IOException e){
            System.out.println("Ocorreu um erro ao tentar iniciar o servidor: " + e.getMessage());
        }
        finally {

        }
    }
}