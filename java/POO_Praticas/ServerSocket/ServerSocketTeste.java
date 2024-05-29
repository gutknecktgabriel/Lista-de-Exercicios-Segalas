package POO_Praticas.ServerSocket;

import java.io.IOException;
import java.net.InetAddress;


public class ServerSocketTeste {
    public static void main(String[] args) throws IOException {
        java.net.ServerSocket server = new java.net.ServerSocket(3322);
        System.out.println("Servidor iniciado na porta 3322");
        InetAddress inet = server.getInetAddress();
        System.out.println("HostAddres="+inet.getHostAddress());
        System.out.println("HostName="+inet.getHostName());
        System.out.println("Porta = "+server.getLocalPort());
        byte[] b = InetAddress.getByName("localhost").getAddress();
        System.out.println(b[0] + "." + b[1] + "." + b[2] + "." + b[3]);
    }
}
