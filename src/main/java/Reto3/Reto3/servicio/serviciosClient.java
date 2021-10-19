package Reto3.Reto3.servicio;

import Reto3.Reto3.Repositorio.RepositorioClient;
import Reto3.Reto3.modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosClient {
    
     @Autowired
    private RepositorioClient metodosCrud;
    public List<Client> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Client> getCliente(int idCliente){
        return metodosCrud.getCliente(idCliente);
    }
    public Client save(Client cliente){
        if(cliente.getIdClient()==null){
            return metodosCrud.save(cliente);
        }else{
            Optional<Client> paux=metodosCrud.getCliente(cliente.getIdClient());
            if(paux.isEmpty()){
            return metodosCrud.save(cliente);
            }else{
                return cliente;
            }
        }
    }
}
