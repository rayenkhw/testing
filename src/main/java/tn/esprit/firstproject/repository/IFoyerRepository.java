package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Universite;

@Repository
public interface IFoyerRepository extends JpaRepository<Foyer,Long> {

    public Foyer findByIdfoyerAndNomfoyer(int idfoy , String nomfoy);



}
