package CadastroClientes.cmd;


import CadastroClientes.View.ClienteView;

import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        ClienteView view = new ClienteView();
        view.showMenu(terminal);
    }
}
