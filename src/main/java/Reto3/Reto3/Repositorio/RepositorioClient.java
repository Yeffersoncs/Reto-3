package Reto3.Reto3.Repositorio;

import Reto3.Reto3.interfas.interfaceClient;
import Reto3.Reto3.modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioClient {
    @Autowired
    private interfaceClient crud;
    
    public List<Client> getAll(){
        return (List<Client>)crud.findAll();
    }
    public Optional<Client> getCliente (int id){
       return crud.findById(id);
    }
    public Client save(Client cliente){
        return crud.save(cliente);
    }
}
