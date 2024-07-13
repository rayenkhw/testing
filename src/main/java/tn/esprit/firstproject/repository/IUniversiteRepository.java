package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Universite;
@Repository
public interface IUniversiteRepository extends JpaRepository<Universite,Long> {


    public  Universite findbynomuniversite(String nomuniv);



}
