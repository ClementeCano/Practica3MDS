import java.util.Date;

public class Animal {
    private Date nacimiento;
    private EstadoAnimal estado;
    private Refugio refugio;
    private Adopcion adopcion;

    public Animal(Date nacimiento) {

        assert (nacimiento != null);

        this.nacimiento = nacimiento;
        this.estado = EstadoAnimal.DISPONIBLE;
    }
    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        assert (nacimiento != null);
        this.nacimiento = nacimiento;
    }

    public EstadoAnimal getEstado(){
        return estado;
    }
    
    public void setEstado(EstadoAnimal estado){
        assert (estado != null);
        this.estado = estado;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    public void setRefugio(Refugio refugio) {
        assert (refugio != null);
        this.refugio = refugio;
    }

    public Adopcion getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(Adopcion adopcion) {
        assert (adopcion != null);
        this.adopcion = adopcion;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+ ": Estado :"+ estado;
    }
}