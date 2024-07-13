package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Universite;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {

    public Universite findByNomETAndPrenomETAndEcole(String nom, String prenom , String ecole);

}
