import java.util.Enumeration;

public interface InterfazDonante {
    void donar(Float cantidad);
    public Enumeration<Donacion> getDonaciones();
}