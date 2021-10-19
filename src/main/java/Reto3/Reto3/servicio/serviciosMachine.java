
package Reto3.Reto3.servicio;

import Reto3.Reto3.modelo.Machine;
import Reto3.Reto3.Repositorio.RepositorioMachine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosMachine {
    
    @Autowired
    private RepositorioMachine metodosCrud;
    public List<Machine> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Machine> getMachine(int idMachine){
        return metodosCrud.getMachine(idMachine);
    }
    public Machine save(Machine machine){
        if(machine.getId()==null){
            return metodosCrud.save(machine);
        }else{
            Optional<Machine> paux=metodosCrud.getMachine(machine.getId());
            if(paux.isEmpty()){
            return metodosCrud.save(machine);
            }else{
                return machine;
            }
        }
    }
}
