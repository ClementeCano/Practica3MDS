import java.util.Enumeration;

public interface InterfazAdoptante {
    Enumeration<Adopcion> getAdopciones();
    void adoptar(Animal animal, Voluntario voluntario);
}