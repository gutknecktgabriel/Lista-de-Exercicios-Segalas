package CadastroContatos.View;

import CadastroContatos.Controller.ContactController;
import CadastroContatos.Model.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private ContactController controller = new ContactController();

    public void showMenu(Scanner terminal){
        int option = -1;
        while(option != 6){
            System.out.println("===============================");
            System.out.println("Cadastro de contatos");
            System.out.println("===============================");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Pesquisar contatos");
            System.out.println("4 - Atualizar contato");
            System.out.println("5 - Remover contato");
            System.out.println("6 - Sair");
            option = Integer.parseInt(terminal.nextLine());
            executeOption(option, terminal);
        }
    }

    private void executeOption(int option, Scanner terminal){
        switch (option){
            case 1:
                createContact(terminal);
                break;
            case 2:
                showListAll();
                break;
            case 3:
                searchContacts(terminal);
                break;
            case 4:
                updateContact(terminal);
                break;
            case 5:
                removeContact(terminal);
                break;
            case 6:
                System.out.println("Aplicação finalizada!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void createContact(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Cadastrar novo contato");
        System.out.println("--------------------------------");
        System.out.println("Digite o nome do contato");
        String name = terminal.nextLine();
        System.out.println("Digite o email do contato");
        String email = terminal.nextLine();
        System.out.println("Digite o telefone do contato");
        String phone = terminal.nextLine();
        //soliciatar a criação do contato para o controller
        boolean ok = controller.createContact(name,email,phone);
        if(ok){
            System.out.println("Cadastro realizado com sucesso");
        }else{
            System.out.println("Não foi possível realizar o cadastro");
        }

    }

    private void showListAll() {
        System.out.println("--------------------------------");
        System.out.println("Listagem de contatos");
        System.out.println("--------------------------------");
        List<Contact> contacts =controller.loadAll();
        if(contacts.size() > 0){
            for(Contact contact : contacts){
                System.out.printf("id: %s - name: %s - email: %s - phone: %s \n",contact.getId(),contact.getName(),contact.getEmail(),contact.getPhone());
            }
        }else{
            System.out.println("Não existem contatos cadastrados");
        }
    }

    private void searchContacts(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Pesquisar de contatos");
        System.out.println("--------------------------------");
        System.out.println("Digite o nome que deseja pesquisar");
        String search = terminal.nextLine();
        List<Contact> contacts = controller.searchContacts(search);
        if(contacts.size() > 0){
            for(Contact contact : contacts){
                System.out.printf("id: %s - name: %s - email: %s - phone: %s \n",contact.getId(),contact.getName(),contact.getEmail(),contact.getPhone());
            }
        }else{
            System.out.println("Não existem contatos cadastrados com o nome informado");
        }
    }

    private void updateContact(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Atualizar contato");
        System.out.println("--------------------------------");
        System.out.println("Digite o código do contato que deseja atualizar");
        String code = terminal.nextLine();

        System.out.println("Digite o novo nome do contato");
        String name = terminal.nextLine();
        System.out.println("Digite o novo email do contato");
        String email = terminal.nextLine();
        System.out.println("Digite o novo telefone do contato");
        String phone = terminal.nextLine();
        //soliciatar a atualização do contato para o controller
        boolean ok = controller.updateContact(code,name,email,phone);
        if(ok){
            System.out.println("Cadastro atualizado com sucesso");
        }else{
            System.out.println("Não foi possível atualizar o cadastro");
        }
    }

    private void removeContact(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Remover contato");
        System.out.println("--------------------------------");
        System.out.println("Digite o código do contato que deseja remover");
        String code = terminal.nextLine();
        //solicitar a remoção do contato para o controller
        boolean ok = controller.removeContact(code);
        if(ok){
            System.out.println("Cadastro removido com sucesso");
        }else{
            System.out.println("Não foi possível remover o cadastro");
        }
    }
}

