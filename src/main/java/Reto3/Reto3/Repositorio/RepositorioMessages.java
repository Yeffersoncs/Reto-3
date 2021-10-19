package Reto3.Reto3.Repositorio;

import Reto3.Reto3.interfas.interfaceMessages;
import Reto3.Reto3.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMessages {
    
    @Autowired
     private interfaceMessages crud;
    
    public List<Message> getAll(){
        return (List<Message>)crud.findAll();
    }
    public Optional<Message> getMessage (int id){
       return crud.findById(id);
    }
    public Message save(Message message){
        return crud.save(message);
    }
}
