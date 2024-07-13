package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.repository.IBlocRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BlocServiceImpl implements IBlocService {

    @Autowired
    IBlocRepository iBlocRepository;
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return iBlocRepository.findAll();
    }

    @Override
    public Optional<Bloc> retrieveBloc(Long idbloc) {
        return iBlocRepository.findById(idbloc);
    }

    @Override
    public Bloc addBloc(Bloc c) {
        return iBlocRepository.save(c);
    }

    @Override
    public void removeBloc(Long idbloc) {
        iBlocRepository.deleteById(idbloc);

    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }


}
