import java.util.Date;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        Refugio refugio = new Refugio();
        Refugio refugioVacio = new Refugio();
        Animal gato = new Animal(new Date(),"Pintuflas");
        Animal perro = new Animal(new Date(), "Firulais");
        Animal caballo = new Animal(new Date(), "Pegaso");
        Voluntario voluntario = new Voluntario(new Date());
        Adoptante adoptante = new Adoptante(new Date());
        Donante donante = new Donante(new Date());

        // Asignar el refugio a las al voluntario, adoptante y donante
        voluntario.setRefugio(refugio);
        adoptante.setRefugio(refugio);
        donante.setRefugio(refugio);

        //Asignar al donante la cantidad a donar
        donante.donar((float)1000);

        //Asignar a los animales el refugio
        voluntario.registrar(gato);
        voluntario.registrar(perro);
        voluntario.registrar(caballo);

        //Adoptamos un animal
        adoptante.adoptar(gato, voluntario);  
        adoptante.adoptar(perro, voluntario);
        
        
        //Mostramos los resultados
        Iterator<Adopcion> it_adop = voluntario.getTramites().asIterator();

        System.out.println("Mostramos todos los tramites del "+voluntario.toString());
        while(it_adop.hasNext()){
            System.out.println("\t"+it_adop.next().toString()); 
        }

        Iterator<Animal> it_anim= refugio.getAnimalesRefugiados().asIterator();
        System.out.println("Mostramos los animales del Refugio refugiados actualmente");

        if (it_anim.hasNext()) {
            while(it_anim.hasNext()){
                System.out.println("\t"+it_anim.next().toString()); 
            }
        } else {
            System.out.println("\tNo hay animales refugiados");
        }
        


        Iterator<Animal> it_ref = refugio.getAnimalesRegistrados().asIterator();
        if (it_ref.hasNext()) {
            System.out.println("Mostramos los animales del Refugio registrados en todo el tiempo");
            while(it_ref.hasNext()){
                System.out.println("\t"+it_ref.next().toString()); 
            }
        } else {
            System.out.println("\tNo hay animales registrados");
        }

        Iterator<Animal> it_animVacio = refugioVacio.getAnimalesRegistrados().asIterator();
        System.out.println("Mostramos los animales del Refugio Vacio refugiados actualmente");
        if (refugioVacio.getAnimalesRegistrados().asIterator().hasNext()) {
            while(it_animVacio.hasNext()){
                System.out.println("\t"+it_animVacio.next().toString()); 
            }
        } else {
            System.out.println("\tNo hay animales registrados");
        }

        Iterator<Animal> it_refVacio = refugioVacio.getAnimalesRegistrados().asIterator();
        System.out.println("Mostramos los animales del Refugio Vacio registrados en todo el tiempo");
        if (it_refVacio.hasNext()) {
            while(it_refVacio.hasNext()){
                System.out.println("\t"+it_refVacio.next().toString()); 
            }
        } else {
            System.out.println("\tNo hay animales registrados");
        }
        
        Iterator<Donacion> it_don = donante.getDonaciones().asIterator();
        System.out.println("Mostramos las donaciones del donante "+ donante.toString());
        if(it_don.hasNext()){
            while(it_don.hasNext()){
                System.out.println(it_don.next().toString());
            } 
        } else{
            System.out.println("\tNo hay donaciones registradas");
        }  
        
    }
}