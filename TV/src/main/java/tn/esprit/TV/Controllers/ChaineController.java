package tn.esprit.TV.Controllers;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.TV.Services.ChaineService;
import tn.esprit.TV.Services.IChaineService;

@RestController
@RequestMapping("/Chaine")
public class ChaineController {
    @Autowired
    private IChaineService chaineService;


}
