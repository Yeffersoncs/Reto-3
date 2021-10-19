
package Reto3.Reto3.web;

import Reto3.Reto3.modelo.Machine;
import Reto3.Reto3.servicio.serviciosMachine;
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
@RequestMapping("/api/Machine")
public class MachineWeb {
    
    @GetMapping("/HolaMundo")
    public String saludar(){
        return "hola mundo";
    }
    
    @Autowired
    private serviciosMachine servicios;
    @GetMapping("/all")
    public List<Machine>getMachine(){
        return servicios.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Machine>getMachine(@PathVariable("id")int id){
        return servicios.getMachine(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine machine){
        return servicios.save(machine);
    }
    
}
