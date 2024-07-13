package tn.esprit.firstproject.entities;



import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {

    @Id
    private long idetudiant;

    private long cin;

    private String nomET;

    private String prenomET;

    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany
    private List<Reservation>  reservation;
}
