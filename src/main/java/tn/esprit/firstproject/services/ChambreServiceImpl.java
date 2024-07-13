package tn.esprit.firstproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.ChambreType;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.repository.IBlocRepository;
import tn.esprit.firstproject.repository.IChambreRepository;
import tn.esprit.firstproject.repository.IUniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreServiceImpl implements IChambreService {

    @Autowired
    IChambreRepository iChambreRepository;

    @Autowired
    IBlocRepository iBlocRepository;

    @Autowired
    IUniversiteRepository iUniversiteRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return iChambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return iChambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return iChambreRepository.save(c);
    }

    @Override
    public void removeChambre(long chambreId) {
        iChambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return iChambreRepository.save(chambre);
    }

    @Override
    public Bloc affectblockchambre(List<Long> idchambres, long idbloc) {
    Bloc bloc  = iBlocRepository.findById(idbloc).get();
    List<Chambre> listechambres = bloc.getChambreList();

        for (long x : idchambres) {
            Chambre a = iChambreRepository.findById(x).get();

            listechambres.add(a);


        }

    bloc.setChambreList(listechambres);


        return bloc;
    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {

    Foyer foyer = iUniversiteRepository.findbynomuniversite(nomUniversite).getFoyer();

    List<Bloc> blocs = foyer.getBlocList();

    List<Chambre> chambri;

        List<Chambre> listefinal = null;
        for (Bloc bloc : blocs) {
            chambri = bloc.getChambreList();
            listefinal.addAll(chambri);


        }

        return listefinal;
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, ChambreType typeC) {
        return null;
    }


}
