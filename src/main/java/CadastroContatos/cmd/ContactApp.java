package CadastroContatos.cmd;


import CadastroContatos.View.ContactView;

import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        ContactView view = new ContactView();
        view.showMenu(terminal);
    }
}
