
package Reto3.Reto3.servicio;

import Reto3.Reto3.modelo.Categoria;
import Reto3.Reto3.Repositorio.RepositorioCategoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosCategoria {
    @Autowired
    private RepositorioCategoria metodosCrud;
    
    public List<Categoria> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Categoria> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    
    public Categoria save(Categoria categoria){
        if(categoria.getId()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Categoria> evt=metodosCrud.getCategoria(categoria.getId());
            if(evt.isEmpty()){
            return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        
        
        }
    
    }
}
