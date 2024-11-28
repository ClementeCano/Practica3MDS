import java.util.Date;

public class Adopcion {
    private Date fecha;
    private Animal animal;
    private Adoptante adoptante;
    private Voluntario voluntario;

    public Adopcion(Date fecha, Animal animal, Adoptante adoptante, Voluntario voluntario) {
        
        assert (fecha != null);
        assert (animal != null);
        assert (adoptante != null);
        assert (voluntario != null);

        this.fecha = fecha;
        this.animal = animal;
        this.adoptante = adoptante;
        this.voluntario = voluntario;

        adoptante.addAdopcion(this);
        animal.setAdopcion(this);
    }
    public Date getFecha() {
        return fecha;
    }
    
    public Animal getAnimal(){
        return animal;
    }
    public Adoptante getAdoptante(){
        return adoptante;
    }
    public Voluntario getVoluntario(){
        return voluntario;
    }
    
    @Override
    public String toString(){
        return "\tFecha :"+fecha.toString()+ ": Animal :"+ animal.toString() + ": Adoptante"+ adoptante.toString() + ": Voluntario : "+ voluntario.toString() ;
    }
}