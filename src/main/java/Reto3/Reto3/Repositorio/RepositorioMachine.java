
package Reto3.Reto3.Repositorio;

import Reto3.Reto3.modelo.Machine;
import Reto3.Reto3.interfas.interfaceMachine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMachine {
    @Autowired
    private interfaceMachine crud;
    
    public List<Machine> getAll(){
        return (List<Machine>)crud.findAll();
    }
    public Optional<Machine> getMachine (int id){
       return crud.findById(id);
    }
    public Machine save(Machine machine){
        return crud.save(machine);
    }

}
