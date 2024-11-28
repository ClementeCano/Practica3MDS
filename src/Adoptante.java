import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;
public class Adoptante extends Socio{
    private List<Adopcion> animales;
    
    public Adoptante(Date fecha) {

        assert (fecha != null);
        
        super(fecha);
        animales = new ArrayList<Adopcion>();
    }

    protected void addAdopcion(Adopcion adopcion){
        assert(adopcion != null);
        animales.add(adopcion);
    }

    protected void rmAdopcion(Adopcion adopcion){
        assert(adopcion != null);
        animales.remove(adopcion);
    }

    public Enumeration<Adopcion> getAdopciones() {
        return java.util.Collections.enumeration(animales);
    }
    
    public void adoptar(Animal animal, Voluntario voluntario){
        assert(voluntario != null);
        assert(animal != null);
        voluntario.tramitarAdopcion(animal, this);
    }
}