package CadastroContatos.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ContactRepository {

    private List<Contact> records = new ArrayList<>();

    public List<Contact> findAll(){
        return Collections.unmodifiableList(records);
    }

    public Contact findById(UUID id){
        Contact result = null;
        for(Contact contact: records){
            if(id.equals(contact.getId())){
                result = contact;
                break;
            }
        }
        return result;
    }

    public List<Contact> findByName(String name){
        List<Contact> result = new ArrayList<>();
        for(Contact contact: records){
            if(contact.getName().toLowerCase().startsWith(name.toLowerCase())){
                result.add(contact);
            }
        }
        return Collections.unmodifiableList(result);
    }


    public boolean insert(Contact contact){
        boolean result = false;
        if(contact != null){
            contact.setId(UUID.randomUUID());
            result = records.add(contact);
        }
        return result;
    }

    public boolean update(Contact contact){
        boolean result = false;
        //verificar qual é a posição que existe o elemento com o mesmo id
        int position = -1;
        for(int index = 0; index < records.size(); index++){
            Contact current = records.get(index);
            if(current.getId().equals(contact.getId())){
                position = index;
                break;
            }
        }
        //preciso trocar o elemento
        if(position > -1){
            result = true;
            records.set(position,contact);
        }
        return result;
    }

    public boolean remove(UUID id){
        boolean result = false;
        //verificar qual é a posição que existe o elemento com o mesmo id
        int position = -1;
        for(int index = 0; index < records.size(); index++){
            Contact current = records.get(index);
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

