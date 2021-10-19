package Reto3.Reto3.servicio;

import Reto3.Reto3.Repositorio.RepositorioReservation;
import Reto3.Reto3.modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosReservation {
    
    @Autowired
    private RepositorioReservation metodosCrud;
    public List<Reservation> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Reservation> getReservation(int idReservation){
        return metodosCrud.getReservation(idReservation);
    }
    public Reservation save(Reservation reservation){
        if(reservation.getIdReservation()==null){
            return metodosCrud.save(reservation);
        }else{
            Optional<Reservation> paux=metodosCrud.getReservation(reservation.getIdReservation());
            if(paux.isEmpty()){
            return metodosCrud.save(reservation);
            }else{
                return reservation;
            }
        }
    }
    
}
