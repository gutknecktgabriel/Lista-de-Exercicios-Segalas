package CadastroClientes.Model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ClienteRepository {

    private List<Cliente> records = new ArrayList<>();

    public List<Cliente> findAll(){
        return Collections.unmodifiableList(records);
    }

    public Cliente findById(UUID id){
        Cliente result = null;
        for(Cliente cliente: records){
            if(id.equals(cliente.getId())){
                result = cliente;
                break;
            }
        }
        return result;
    }

    public List<Cliente> findByName(String name){
        List<Cliente> result = new ArrayList<>();
        for(Cliente cliente: records){
            if(cliente.getName().toLowerCase().startsWith(name.toLowerCase())){
                result.add(cliente);
            }
        }
        return Collections.unmodifiableList(result);
    }


    public boolean insert(Cliente cliente){
        boolean result = false;
        if(cliente != null){
            cliente.setId(UUID.randomUUID());
            result = records.add(cliente);
        }
        return result;
    }

    public boolean update(Cliente cliente){
        boolean result = false;
        //verificar qual é a posição que existe o elemento com o mesmo id
        int position = -1;
        for(int index = 0; index < records.size(); index++){
            Cliente current = records.get(index);
            if(current.getId().equals(cliente.getId())){
                position = index;
                break;
            }
        }
        //preciso trocar o elemento
        if(position > -1){
            result = true;
            records.set(position,cliente);
        }
        return result;
    }

    public boolean remove(UUID id){
        boolean result = false;
        //verificar qual é a posição que existe o elemento com o mesmo id
        int position = -1;
        for(int index = 0; index < records.size(); index++){
            Cliente current = records.get(index);
            if(id.equals(current.getId())){
                position = index;
                break;
            }
        }
        //preciso remover o elemento
        if(position > -1){
            result = true;
            records.remove(position);
        }
        return result;

    }
}

