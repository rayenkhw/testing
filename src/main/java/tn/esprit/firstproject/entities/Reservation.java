package tn.esprit.firstproject.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    private String idreservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToMany(mappedBy = "reservation")
    private List<Etudiant> etudiants ;

    @ManyToOne
    private Chambre chambre;

}
