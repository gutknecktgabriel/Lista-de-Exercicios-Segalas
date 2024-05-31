package POO_Praticas.ServerCommunication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ThreadCliente extends Thread {
    private Socket cliente;

    public ThreadCliente(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
            String arquivo = (String) entrada.readObject();
            byte buffer[] = new byte[512];
            FileInputStream file = new FileInputStream(arquivo);
            DataInputStream arq = new DataInputStream(file);
            saida.flush();
            int leitura = arq.read(buffer);

            while (leitura != -1) {
                if (leitura != -2) {
                    saida.write(buffer, 0, leitura);
                }
                leitura = arq.read(buffer);
            }
            System.out.println("Cliente atendido com sucesso: " + arquivo + cliente.getRemoteSocketAddress().toString());
            entrada.close();
            saida.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Erro durante leitura da thread: " + e.getMessage());
        }
        try {
            cliente.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

