package tn.esprit.firstproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Universite {
    @Id
    private long iduniversite;

    private String nomuniversite;

    private String adresse;

    @OneToOne
    private Foyer foyer;

}
