
package Reto3.Reto3.Repositorio;

import Reto3.Reto3.modelo.Categoria;
import Reto3.Reto3.interfas.interfasCategoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCategoria {
    
    @Autowired
    private interfasCategoria crud;
    
    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }
    public Optional <Categoria> getCategoria(int id){
        return crud.findById(id);
    }
    
    public Categoria save(Categoria categoria){
        return crud.save(categoria);
    }
}
