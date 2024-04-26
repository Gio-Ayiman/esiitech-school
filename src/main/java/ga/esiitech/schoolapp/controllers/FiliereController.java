package ga.esiitech.schoolapp.controllers;

import ga.esiitech.schoolapp.dtos.FiliereDto;
import ga.esiitech.schoolapp.entities.Filiere;
import ga.esiitech.schoolapp.services.FiliereService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filieres")
@RequiredArgsConstructor
public class FiliereController {

    private final FiliereService filiereService;

    @PostMapping
    public String creerFiliere(@RequestBody FiliereDto filiereDto) {
        filiereService.creerFiliere(filiereDto);

        return "Votre filiere "+ filiereDto.getNom() + "  a bien ete creee !";
    }

}
