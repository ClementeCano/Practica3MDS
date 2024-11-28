import java.util.ArrayList;
import java.util.List;
import java.util.Date;

// Clase Voluntario
public class VoluntarioImpl implements InterfazVoluntario {
    private List<Animal> animalesRegistrados = new ArrayList<>();

    public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
        assert(adoptante != null);
        assert(animal != null);
        if(animal.getEstado() != EstadoAnimal.ENTRATAMIENTO){
            animal.setEstado(EstadoAnimal.ADOPTADO);

            Refugio r = super.getRefugio();
            r.rmAnimalRefugiado(animal);

            Adopcion adopcion = new Adopcion(new Date(), animal, adoptante, this);
            addTramites(adopcion);

            //ASSERTS
            /*
            assert(r.getAnimalesRefugiados().contains(animal));//Confirmamos que el refugio contenga el animal
            assert(r.getAnimalesRefugiados().size()>0);//Confirmamos que el refugio contenga al menos un animal
            assert(getTramites().contains(adopcion));
            assert(getTramites().size()>0);
            assert(animal.getAdopcion() != null);
            */
        }else {
            System.out.println("No podemos dar en adopcion a un animal en tratamiento.");
        }
    }

    public void registrar(Animal animal) {
        animalesRegistrados.add(animal);
    }
}