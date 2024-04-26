package ga.esiitech.schoolapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatiereDto {
    private String nomMatiere;
    private int coefficientMatiere;
    private int volumeHoraireMatiere;
    private List<Long> filieresId;
}
