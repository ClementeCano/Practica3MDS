import java.util.Date;
public abstract class Socio {

    private Date registro;
    private Refugio refugio;

    public Socio(Date registro) {
        assert registro != null;
        this.registro = registro;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        assert registro != null;
        this.registro = registro;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    public void setRefugio(Refugio refugio) {
        assert refugio != null;
        this.refugio = refugio;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}