package CadastroClientes.View;

import CadastroClientes.Controller.ClienteController;
import CadastroClientes.Model.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteView {
    private ClienteController controller = new ClienteController();

    public void showMenu(Scanner terminal){
        int option = -1;
        while(option != 6){
            System.out.println("===============================");
            System.out.println("Cadastro de cliente");
            System.out.println("===============================");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Pesquisar clientes");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Remover cliente");
            System.out.println("6 - Sair");
            option = Integer.parseInt(terminal.nextLine());
            executeOption(option, terminal);
        }
    }

    private void executeOption(int option, Scanner terminal){
        switch (option){
            case 1:
                createCliente(terminal);
                break;
            case 2:
                showListAll();
                break;
            case 3:
                searchCliente(terminal);
                break;
            case 4:
                updateCliente(terminal);
                break;
            case 5:
                removeCliente(terminal);
                break;
            case 6:
                System.out.println("Aplicação finalizada!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void createCliente(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Cadastrar novo cliente");
        System.out.println("--------------------------------");
        System.out.println("Digite o nome do cliente");
        String name = terminal.nextLine();
        System.out.println("Digite cpf do cliente");
        String cpf = terminal.nextLine();
        System.out.println("Digite o telefone do cliente");
        String phone = terminal.nextLine();
        //soliciatar a criação do contato para o controller
        boolean ok = controller.createContact(name,cpf,phone);
        if(ok){
            System.out.println("Cadastro realizado com sucesso");
        }else{
            System.out.println("Não foi possível realizar o cadastro");
        }

    }

    private void showListAll() {
        System.out.println("--------------------------------");
        System.out.println("Listagem de clientes");
        System.out.println("--------------------------------");
        List<Cliente> clientes =controller.loadAll();
        if(clientes.size() > 0){
            for(Cliente cliente : clientes){
                System.out.printf("id: %s - name: %s - email: %s - phone: %s \n",cliente.getId(),cliente.getName(),cliente.getCpf(),cliente.getPhone());
            }
        }else{
            System.out.println("Não existem clientes cadastrados");
        }
    }

    private void searchCliente(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Pesquisar clientes");
        System.out.println("--------------------------------");
        System.out.println("Digite o cliente que deseja pesquisar");
        String search = terminal.nextLine();
        List<Cliente> contacts = controller.searchClientes(search);
        if(contacts.size() > 0){
            for(Cliente contact : contacts){
                System.out.printf("id: %s - name: %s - email: %s - phone: %s \n",contact.getId(),contact.getName(),contact.getCpf(),contact.getPhone());
            }
        }else{
            System.out.println("Não existem clientes cadastrados com o nome informado");
        }
    }

    private void updateCliente(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Atualizar clientes");
        System.out.println("--------------------------------");
        System.out.println("Digite o código do cliente que deseja atualizar");
        String code = terminal.nextLine();

        System.out.println("Digite o novo nome do cliente");
        String name = terminal.nextLine();
        System.out.println("Digite o novo email do cliente");
        String cpf = terminal.nextLine();
        System.out.println("Digite o novo telefone do cliente");
        String phone = terminal.nextLine();
        //soliciatar a atualização do contato para o controller
        boolean ok = controller.updateClientes(code,name,cpf,phone);
        if(ok){
            System.out.println("Cadastro atualizado com sucesso");
        }else{
            System.out.println("Não foi possível atualizar o cadastro");
        }
    }

    private void removeCliente(Scanner terminal) {
        System.out.println("--------------------------------");
        System.out.println("Remover cliente");
        System.out.println("--------------------------------");
        System.out.println("Digite o código do cliente que deseja remover");
        String code = terminal.nextLine();
        //solicitar a remoção do contato para o controller
        boolean ok = controller.removeCliente(code);
        if(ok){
            System.out.println("Cliente removido com sucesso");
        }else{
            System.out.println("Não foi possível remover o cliente");
        }
    }
}

