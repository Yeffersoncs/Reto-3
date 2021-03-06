package Reto3.Reto3.Repositorio;

import Reto3.Reto3.interfas.interfaceScore;
import Reto3.Reto3.modelo.Score;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioScore {
    
    @Autowired
     private interfaceScore crud;
    
    public List<Score> getAll(){
        return (List<Score>)crud.findAll();
    }
    public Optional<Score> getScores (int id){
       return crud.findById(id);
    }
    public Score save(Score score){
        return crud.save(score);
    }
    
}
