package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();

    public Optional<Reservation> retrieveReservation(String idreservation);

    public Reservation addReservation(Reservation c);

    public void removeReservation(String idreservation);

    public Reservation modifyReservation(Reservation reservation);


}
