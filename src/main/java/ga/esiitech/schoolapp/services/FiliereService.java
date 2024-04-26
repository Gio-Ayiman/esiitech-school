package ga.esiitech.schoolapp.services;

import ga.esiitech.schoolapp.dtos.FiliereDto;
import ga.esiitech.schoolapp.entities.Ecole;
import ga.esiitech.schoolapp.entities.Filiere;
import ga.esiitech.schoolapp.repos.EcoleDao;
import ga.esiitech.schoolapp.repos.FiliereDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FiliereService {
    private final FiliereDao filiereDao;
    private final EcoleDao ecoleDao;

    public Optional<Filiere> getFiliere(Long id) {
        return filiereDao.findById(id);
    }

    public void creerFiliere(FiliereDto filiereDto) {
        Filiere filiere = new Filiere();
        Optional<Ecole> ecole = ecoleDao.findById(filiereDto.getEcoleId());


        filiere.setNom(filiereDto.getNom());
        filiere.setEcole(ecole.get());

        filiereDao.save(filiere);
    }

    public void supprimerFiliere(Long id) {
        filiereDao.deleteById(id);
    }
}
