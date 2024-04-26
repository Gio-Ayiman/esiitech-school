package ga.esiitech.schoolapp.controllers;

import ga.esiitech.schoolapp.dtos.MatiereDto;
import ga.esiitech.schoolapp.entities.Matiere;
import ga.esiitech.schoolapp.services.MatiereService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matieres")
@AllArgsConstructor
public class MatiereController {

    private MatiereService matiereService;

    @GetMapping
    public List<Matiere> recupererListMatieres() {
        return matiereService.recupererLesMatieres();
    }

    @PostMapping
    public void creerUneMatiere(@RequestBody MatiereDto matiereDto) {
        matiereService.creerMatiere(matiereDto);
    }

    @DeleteMapping("/{id}")
    public void supprimerMatiere(@PathVariable("id") Long matiereId) {
        matiereService.supprimerMatiere(matiereId);
    }
}

