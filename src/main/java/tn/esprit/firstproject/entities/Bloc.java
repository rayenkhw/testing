package tn.esprit.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Bloc {

    @Id
    private long idbloc;

    private long capacitebloc;

    private String nombloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private List<Chambre> chambreList;
}
