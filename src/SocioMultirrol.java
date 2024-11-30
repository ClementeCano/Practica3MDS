import java.util.Date;
import java.util.Enumeration;

public class SocioMultirrol extends Socio implements InterfazAdoptante, InterfazVoluntario, InterfazDonante {

    private Adoptante adoptante;
    private Voluntario voluntario;
    private Donante donante;

    public SocioMultirrol(Date fecha){
        super(fecha);
        adoptante = new Adoptante(fecha);
        voluntario = new Voluntario(fecha);
        donante = new Donante(fecha);
    }
    
    @Override
    public void setRefugio(Refugio r){
        adoptante.setRefugio(r);
        voluntario.setRefugio(r);
        donante.setRefugio(r);
    }

    @Override
    public void donar(Float cantidad) {
        donante.donar(cantidad);
    }
    
    @Override
    public Enumeration<Donacion> getDonaciones() {
        return donante.getDonaciones();
    }

    @Override
    public Enumeration<Adopcion> getTramites() {
        return voluntario.getTramites();
    }

    @Override
    public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
        voluntario.tramitarAdopcion(animal,adoptante);
    }

    @Override
    public void registrar(Animal animal) {
        voluntario.registrar(animal);
    }

    @Override
    public Enumeration<Adopcion> getAdopciones() {
        return adoptante.getAdopciones();
    }

    @Override
    public void adoptar(Animal animal, Voluntario voluntario) {
        adoptante.adoptar(animal, voluntario);
    }

    public void adoptar(Animal animal) {
        adoptante.adoptar(animal, this.voluntario);
    }

    public Donante getDonante(){
        return this.donante;
    }

    public void setDonante(Donante donante){
        this.donante = donante;
    }

    public Voluntario getVoluntario(){
        return this.voluntario;
    }

    public void setVoluntario(Voluntario voluntario){
        this.voluntario = voluntario;
    }

    public Adoptante getAdoptante(){
        return this.adoptante;
    }

    public void setAdoptante(Adoptante adoptante){
        this.adoptante = adoptante;
    }
}
