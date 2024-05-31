package POO_Praticas.ServerCommunication;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceptorUDP {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Informe a porta para conexão");
            System.exit(0);
        }
        try {
            int port = Integer.parseInt(args[0]);
            DatagramSocket ds = new DatagramSocket(port);
            System.out.println("Conectando a porta: " + port);
            byte[] msg = new byte[256];
            DatagramPacket pkg = new DatagramPacket(msg, msg.length);
            ds.receive(pkg);
            JOptionPane.showMessageDialog(null, new String(pkg.getData()).trim(), "Mensagem recebida", 1);
            ds.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
