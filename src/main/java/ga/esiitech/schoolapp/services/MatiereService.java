package ga.esiitech.schoolapp.services;

import ga.esiitech.schoolapp.dtos.MatiereDto;
import ga.esiitech.schoolapp.entities.Filiere;
import ga.esiitech.schoolapp.entities.Matiere;
import ga.esiitech.schoolapp.repos.FiliereDao;
import ga.esiitech.schoolapp.repos.MatiereDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class MatiereService {

    private MatiereDao matiereDao;
    private FiliereDao filiereDao;

    public void creerMatiere(MatiereDto matiereDto) {
        Matiere matiere = new Matiere();
        List<Filiere> filieres = new ArrayList<>();

        matiere.setNom(matiereDto.getNomMatiere());
        matiere.setCoefficient(matiereDto.getCoefficientMatiere());
        matiere.setVolumeHoraire(matiereDto.getVolumeHoraireMatiere());

        for (int i = 0; i < matiereDto.getFilieresId().size(); i++) {
            Long indexCourant = matiereDto.getFilieresId().get(i);
            Filiere filiereCourante = filiereDao.findById(indexCourant).get();
            filieres.add(filiereCourante);
        }

        matiere.setFilieres(filieres);


        matiereDao.save(matiere);
    }


    public List<Matiere> recupererLesMatieres() {
        return matiereDao.findAll();
    }


    public void supprimerMatiere(Long id) {
        matiereDao.deleteById(id);
    }

}
