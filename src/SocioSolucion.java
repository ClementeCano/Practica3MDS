import java.util.Date;

public class SocioSolucion {
    private Date registro;
    private Voluntario voluntario;
    private Adoptante adoptante;
    private Donante donante;

    // Constructor
    public SocioSolucion(Date registro) {
        this.registro = registro;
    }

    // Métodos para asignar roles
    public void asignarVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    public void asignarAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }

    public void asignarDonante(Donante donante) {
        this.donante = donante;
    }

    // Métodos para verificar roles
    public boolean esVoluntario() {
        return voluntario != null;
    }

    public boolean esAdoptante() {
        return adoptante != null;
    }

    public boolean esDonante() {
        return donante != null;
    }

    // Métodos para acceder a las instancias de los roles
    public Voluntario getVoluntario() {
        return voluntario;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public Donante getDonante() {
        return donante;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
