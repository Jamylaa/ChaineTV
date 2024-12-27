package tn.esprit.TV.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.TV.Entities.Utilisateur;
import tn.esprit.TV.Services.IUtilisateurService;
import tn.esprit.TV.Services.UtilisateurService;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    @Autowired
    private IUtilisateurService utilisateurService;


    @PostMapping("/Add Utilisateur")
    public Utilisateur ajouterUtlisateur(@RequestBody Utilisateur u ){
        return utilisateurService.ajouterUtilisateur(u);
    }
}
