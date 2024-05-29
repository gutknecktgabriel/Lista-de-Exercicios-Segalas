package POO_Praticas.ServerSocket;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends javax.swing.JFrame {
    private Socket cliente;

    /////////////////////////ADICIONAR DEPOIS public FClient() {
    //        initComponents();
    //        initCliente();
    //    }
    private void initClient(){
        try {
            cliente = new Socket("127.0.0.1",3322);
        }
        catch (IOException e){
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    private void initComponents() {
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea jTextArea1 = new javax.swing.JTextArea();
        JButton jButton1 = new javax.swing.JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
