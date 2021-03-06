package Reto3.Reto3.web;


import Reto3.Reto3.modelo.Client;
import Reto3.Reto3.servicio.serviciosClient;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Client")
public class ClientWeb {
    
    
   @Autowired
    private serviciosClient servicios;
    @GetMapping("/all")
    public List<Client>getCliente(){
        return servicios.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Client>getCliente(@PathVariable("id")int id){
        return servicios.getCliente(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client cliente){
        return servicios.save(cliente);
    }
    
}
