import java.util.Enumeration;

public interface InterfazVoluntario {
    Enumeration<Adopcion> getTramites();
    void tramitarAdopcion(Animal animal, Adoptante adoptante);
    void registrar(Animal animal);
}