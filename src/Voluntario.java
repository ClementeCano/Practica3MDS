import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voluntario extends Socio{

    private List<Adopcion> tramites;

    public Voluntario(Date fecha) {
        assert(fecha != null);
        super(fecha);
        tramites = new ArrayList<>();
    }

    public List<Adopcion> getTramites() {
        return tramites;
    }

    protected void addTramites(Adopcion adopcion){
        assert(adopcion != null);
        tramites.add(adopcion);
        
    }
    
    public void tramitarAdopcion(Animal animal, Adoptante adoptante){
        assert(adoptante != null);
        assert(animal != null);
        if(animal.getEstado() != EstadoAnimal.ENTRATAMIENTO){
            animal.setEstado(EstadoAnimal.ADOPTADO);

            Refugio r = super.getRefugio();
            r.rmAnimalRefugiado(animal);

            Adopcion adopcion = new Adopcion(new Date(), animal, adoptante, this);
            addTramites(adopcion);

            //ASSERTS
            assert(r.getAnimalesRefugiados().contains(animal));//Confirmamos que el refugio contenga el animal
            assert(r.getAnimalesRefugiados().size()>0);//Confirmamos que el refugio contenga al menos un animal
            assert(getTramites().contains(adopcion));
            assert(getTramites().size()>0);
            assert(animal.getAdopcion() != null);
        }else {
            System.out.println("No podemos dar en adopcion a un animal en tratamiento.");
        }
    }

    public void registrar(Animal animal){
        super.getRefugio().registrar(animal);
        assert(super.getRefugio().getAnimalesRegistrados().size()>0);
    }
}
