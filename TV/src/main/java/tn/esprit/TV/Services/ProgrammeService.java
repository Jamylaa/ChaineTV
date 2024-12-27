package tn.esprit.TV.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.TV.Entities.Programme;
import tn.esprit.TV.Repositories.IChaineRepository;
import tn.esprit.TV.Repositories.IProgrammeRepository;

@Service
public class ProgrammeService implements IProogrammeService{
@Autowired
    private IProgrammeRepository programmeRepository;
@Autowired
private IChaineRepository chaineRepository;

    @Override
    public Programme ajouterProgrammeEtChaine(Programme p) {
        return programmeRepository.save(p);
    }
}
