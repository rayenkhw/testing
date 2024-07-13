package tn.esprit.firstproject.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {

    @Id
    private long idfoyer;

    private String nomfoyer;

    private long  capacitefoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy="foyer")
    private List<Bloc> blocList;
}
