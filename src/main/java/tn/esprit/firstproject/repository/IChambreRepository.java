package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.ChambreType;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {

    public Chambre findByNumchambre(int num);
    public List<Chambre> findByBlocIdblocAndChambretype(long idbloc, ChambreType typechambre);
}
