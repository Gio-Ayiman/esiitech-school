package ga.esiitech.schoolapp.controllers;

import ga.esiitech.schoolapp.entities.Ecole;
import ga.esiitech.schoolapp.repos.EcoleDao;
import jakarta.persistence.EntityNotFoundException;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecoles")
public class EcoleController {
    @Autowired
    private EcoleDao ecoleDao;

    @PostMapping
    public String creerEcole(@RequestBody Ecole ecole) {
        ecoleDao.save(ecole);

        return "Vous venez de creer l'ecole " + ecole.getNom();
    }

    @GetMapping
    public List<Ecole> recupererListeEcole() {
        return ecoleDao.findAll();
    }

    @GetMapping("/email/{email}")
    public Ecole rechercheParEmail(@PathVariable("email") String email) {
        Ecole ecole = ecoleDao.findByEmail(email);

        if (ecole != null) {
            return ecole;
        } else {
            throw new EntityNotFoundException("L'ecole avec l'email " + email + " n'existe pas dans notre base de donnees");
        }
    }

    @GetMapping("/contact/{contact}")
    public Ecole rechercheParcontact(@PathVariable("contact") String contact) {
        Ecole ecole = ecoleDao.findByNumeroTelephone(contact);

        if (ecole != null) {
            return ecole;
        } else {
            throw new EntityNotFoundException("Introuvable ");
        }


    }
}


