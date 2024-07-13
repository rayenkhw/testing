package tn.esprit.firstproject.services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.ChambreType;

import java.util.List;


public interface IChambreService {
    public List<Chambre> retrieveAllChambres();

    public Chambre retrieveChambre(Long chambreId);

    public Chambre addChambre(Chambre c);

    public void removeChambre(long chambreId);

    public Chambre modifyChambre(Chambre chambre);

    public Bloc affectblockchambre (List<Long> idchambres, long idbloc );

    public List<Chambre>  getChambresParNomUniversite( String nomUniversite) ;

    public List<Chambre> getChambresParBlocEtType (long idBloc, ChambreType typeC) ;
}