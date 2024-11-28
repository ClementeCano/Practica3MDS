import java.util.Date;
import java.util.List;
public class Donante extends Socio{

    private List<Donacion> donaciones;

    public Donante(Date fecha) {

        assert(fecha != null);

        super(fecha);
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void addDonacion(Donacion donacion) {
        assert(donacion != null);
        assert(donacion.getCantidad() > 0);
        
        donaciones.add(donacion);
    }

    public void rmDonacion(Donacion donacion) {
        assert(donacion != null);

        donaciones.remove(donacion);
    }

    public void donar(Float cantidad) {
        assert(cantidad > 0);
        if (cantidad > 0) {
            Donacion donacion = new Donacion(cantidad, new Date());

            assert(donacion != null);

            addDonacion(donacion);

            // le sumamos la donacion al refugio del socio
            Refugio refugio = super.getRefugio();
            refugio.setLiquidez(refugio.getLiquidez() + cantidad);
            // super.setRefugio(refugio);

            assert(refugio != null);

        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }
}