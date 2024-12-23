import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Refugio {
    private Float liquidez;
    private List<Animal> animalesRefugiados;
    private List<Animal> animalesRegistrados;
    private List<Socio> socios;

    public Refugio() {
        this.liquidez = 0.0f;
        animalesRefugiados = new ArrayList<>();
        animalesRegistrados = new ArrayList<>();
        socios = new ArrayList<>();
    }
    //METODOS LIQUIDEZ
    public Float getLiquidez() {
        return liquidez;
    }

    public void setLiquidez(Float liquidez) {
        assert(liquidez >= 0);

        this.liquidez = liquidez;
    }


    //METODOS ANIMALESREGFUGIADOS
    public Enumeration<Animal> getAnimalesRefugiados() {
        return java.util.Collections.enumeration(animalesRefugiados);
    }

    protected void addAnimalRefugiado(Animal a){
        assert(a != null);
        animalesRefugiados.add(a);
    }

    // EXPLICACIÓN: ¿Por qué podemos eliminar un animal refugiado?
    //              ¿Por qué es protected?
    protected void rmAnimalRefugiado(Animal a){
        assert(a != null);
        animalesRefugiados.remove(a);
    }



    //METODOS ANIMALESREGISTRADOS
    public Enumeration<Animal> getAnimalesRegistrados() {
        return java.util.Collections.enumeration(animalesRegistrados);
    }

    protected void addAnimalRegistrado(Animal a){
        assert(a != null);
        animalesRegistrados.add(a);
    }

    protected void rmAnimalRegistrado(Animal a){
        assert(a != null);
        animalesRegistrados.remove(a);
    }

    
    //METODOS SO
    public Enumeration<Socio> getSocios() {
        return java.util.Collections.enumeration(socios);
    }


    public void registrar(Animal a){
        assert(animalesRegistrados != null);
        a.setEstado(EstadoAnimal.DISPONIBLE);
        addAnimalRegistrado(a);
        addAnimalRefugiado(a);
        assert(animalesRegistrados.size()>0);
        assert(animalesRegistrados.contains(a));
    }
    
    // EXPLICACIÓN: ¿Por qué podemos eliminar un socio?
    //              ¿Por qué es protected?
    protected void rmSocio(Socio s){
        socios.remove(s);
    }

    protected void addSocio(Socio s){
        assert(s != null);
        socios.add(s);
    }

    
}