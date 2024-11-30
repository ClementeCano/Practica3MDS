import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;
public class Adoptante extends Socio implements InterfazAdoptante{
    private List<Adopcion> adopciones;
    
    public Adoptante(Date fecha) {

        assert (fecha != null);
        
        super(fecha);
        adopciones = new ArrayList<Adopcion>();
    }

    protected void addAdopcion(Adopcion adopcion){
        assert(adopcion != null);
        adopciones.add(adopcion);
    }

    protected void rmAdopcion(Adopcion adopcion){
        assert(adopcion != null);
        adopciones.remove(adopcion);
    }

    @Override
    public Enumeration<Adopcion> getAdopciones() {
        return java.util.Collections.enumeration(adopciones);
    }
    
    @Override
    public void adoptar(Animal animal, Voluntario voluntario){
        assert(voluntario != null);
        assert(animal != null);
        voluntario.tramitarAdopcion(animal, this);
    }
    
}