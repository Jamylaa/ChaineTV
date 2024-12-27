package tn.esprit.TV.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.TV.Entities.Programme;
import tn.esprit.TV.Services.ProgrammeService;
@RestController
@RequestMapping("/Programme")
public class ProgrammeController {

    @Autowired
    private ProgrammeService programmeService;
    @PostMapping("/Add Programme")
    public Programme ajouterProgrammeEtChaine(@RequestBody Programme p) {
        return programmeService.ajouterProgrammeEtChaine(p);
    }
}
