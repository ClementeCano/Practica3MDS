import java.util.Date;

public class Donacion {
    private double cantidad;
    private Date fecha;

    public Donacion(double cantidad, Date fecha) {
        assert(cantidad > 0); 
        assert(fecha != null);

        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        assert(cantidad > 0);
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        assert(fecha != null);
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "\t"+this.getClass().getName() + ": Cantidad : "+ cantidad + ": Fecha : "+fecha;
    }
}