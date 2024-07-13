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
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int numchambre;

    @Enumerated(EnumType.STRING)
    private ChambreType chambretype;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "chambre")
    private List<Reservation> reservationList;

    @ManyToOne
    private Bloc bloc;
}
