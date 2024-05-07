package CadastroClientes.Controller;

import CadastroClientes.Model.Cliente;
import CadastroClientes.Model.ClienteRepository;

import java.util.List;
import java.util.UUID;

public class ClienteController {

    private ClienteRepository repository = new ClienteRepository();

    public boolean createContact(String name, String cpf, String phone){
        Cliente newCliente = new Cliente();
        newCliente.setName(name);
        newCliente.setCpf(cpf);
        newCliente.setPhone(phone);
        return repository.insert(newCliente);
    }

    public List<Cliente> loadAll(){
        return repository.findAll();
    }

    public List<Cliente> searchClientes(String name){
        return repository.findByName(name);
    }

    public boolean updateClientes(String id, String name, String cpf, String phone){
        Cliente cliente = repository.findById(UUID.fromString(id));
        if(cliente == null){
            return false;
        }
        cliente.setName(name);
        cliente.setCpf(cpf);
        cliente.setPhone(phone);
        return repository.update(cliente);
    }

    public boolean removeCliente(String id){
        return repository.remove(UUID.fromString(id));
    }
}