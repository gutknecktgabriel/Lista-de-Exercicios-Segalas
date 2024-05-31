package POO_Praticas.ServerCommunication;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class UsuarioTCP_Basico {
    public static void main(String[] args) {
        try {
            Socket usuario = new Socket("LOCAL",4578);
            ObjectInputStream entrada = new ObjectInputStream(usuario.getInputStream());
            Date data_atual = (Date) entrada.readObject();
            JOptionPane.showMessageDialog(null,"Data recevida do servidor: " + data_atual.toString());
            entrada.close();
            System.out.println("Conexão encerrada");
        }
        catch (Exception e){
            System.out.println("Não possível iniciar a conexão com o usuário: " + e.getMessage());
        }
    }
}
