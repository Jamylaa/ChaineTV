package tn.esprit.TV.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.TV.Entities.Utilisateur;
import tn.esprit.TV.Repositories.IUtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService{
@Autowired
    private IUtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);}
}
