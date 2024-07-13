package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.services.IReservationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservationctrl")
public class ReservationController {

    @Autowired
    IReservationService reservationService;


    @PostMapping("/addreservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        return reservationService.addReservation(c);
    }

    @PostMapping("/retrieveAllReservations")
    public List<Reservation> retrieveAllReservations(){return reservationService.retrieveAllReservations() ;}

    @PostMapping("/retrieveReservation")
    public Optional<Reservation> retrieveReservation(@RequestBody Reservation c){return reservationService.retrieveReservation(c.getIdreservation());}

    @PostMapping("/removeReservation")
    public void removeReservation(@RequestBody Reservation c) {reservationService.removeReservation(c.getIdreservation()); ;}

    @PostMapping("/modifyReservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {return reservationService.modifyReservation(c) ;}



}
