package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.repository.IReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements IReservationService{

    @Autowired
    IReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> retrieveReservation(String idreservation) {
        return reservationRepository.findById(Long.valueOf(idreservation));
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return reservationRepository.save(c);
    }

    @Override
    public void removeReservation(String idreservation) {
        reservationRepository.deleteById(Long.valueOf(idreservation));
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
