package Reto3.Reto3.servicio;

import Reto3.Reto3.Repositorio.RepositorioMessages;
import Reto3.Reto3.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosMessages {
    @Autowired
    private RepositorioMessages metodosCrud;
    public List<Message> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Message> getMessage(int idMessage){
        return metodosCrud.getMessage(idMessage);
    }
    public Message save(Message messages){
        if(messages.getIdMessage()==null){
            return metodosCrud.save(messages);
        }else{
            Optional<Message> paux=metodosCrud.getMessage(messages.getIdMessage());
            if(paux.isEmpty()){
            return metodosCrud.save(messages);
            }else{
                return messages;
            }
        }
    }
}
