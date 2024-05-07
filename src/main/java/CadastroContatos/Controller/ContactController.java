package CadastroContatos.Controller;

import CadastroContatos.Model.Contact;
import CadastroContatos.Model.ContactRepository;

import java.util.List;
import java.util.UUID;

public class ContactController {

    private ContactRepository repository = new ContactRepository();

    public boolean createContact(String name, String email, String phone){
        Contact newContact = new Contact();
        newContact.setName(name);
        newContact.setEmail(email);
        newContact.setPhone(phone);
        return repository.insert(newContact);
    }

    public List<Contact> loadAll(){
        return repository.findAll();
    }

    public List<Contact> searchContacts(String name){
        return repository.findByName(name);
    }

    public boolean updateContact(String id, String name, String email, String phone){
        Contact contact = repository.findById(UUID.fromString(id));
        if(contact == null){
            return false;
        }
        contact.setName(name);
        contact.setEmail(email);
        contact.setPhone(phone);
        return repository.update(contact);
    }

    public boolean removeContact(String id){
        return repository.remove(UUID.fromString(id));
    }
}
