package Reto3.Reto3.Repositorio;

import Reto3.Reto3.interfas.interfaceReservation;
import Reto3.Reto3.modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioReservation {
    
    @Autowired
    private interfaceReservation crud;
    
     public List<Reservation> getAll(){
        return (List<Reservation>)crud.findAll();
    }
    public Optional<Reservation> getReservation (int id){
       return crud.findById(id);
    }
    public Reservation save(Reservation reservation){
        return crud.save(reservation);
    }
}
