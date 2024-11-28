import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        Refugio refugio = new Refugio();
        Refugio refugioVacio = new Refugio();
        Animal gato = new Animal(new Date());
        Animal perro = new Animal(new Date());
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

        //Adoptamos un animal
        adoptante.adoptar(gato, voluntario);
        
        

        //Mostramos los resultados

        System.out.println("Mostramos todos los tramites");
        while(voluntario.getTramites().hasMoreElements()){
            System.out.println(voluntario.getTramites().nextElement().toString()); 

        }

        System.out.println("Mostramos los animales del refugio "+refugio.toString()+ " refugiados actualmente");
        while(refugio.getAnimalesRefugiados().hasMoreElements()){
            System.out.println(refugio.getAnimalesRefugiados().nextElement().toString()); 
        }

        System.out.println("Mostramos los animales del refugio "+refugio.toString()+ " registrados en todo el tiempo");
        while(refugio.getAnimalesRegistrados().hasMoreElements()){
            System.out.println(refugio.getAnimalesRegistrados().nextElement().toString()); 
        }

        System.out.println("Mostramos los animales del refugio " + refugioVacio.toString() + " refugiados actualmente");
        if (refugioVacio.getAnimalesRegistrados().hasMoreElements()) {
            while(refugioVacio.getAnimalesRefugiados().hasMoreElements()){
                System.out.println(refugioVacio.getAnimalesRefugiados().nextElement().toString()); 
            }
        } else {
            System.out.println("No hay animales registrados");
        }
        
        System.out.println("Mostramos los animales del refugio " + refugioVacio.toString() + " registrados en todo el tiempo");
        if (refugioVacio.getAnimalesRegistrados().hasMoreElements()) {
            while(refugioVacio.getAnimalesRegistrados().hasMoreElements()){
                System.out.println(refugioVacio.getAnimalesRegistrados().nextElement().toString()); 
            }
        } else {
            System.out.println("No hay animales registrados");
        }
        
        
        System.out.println("Mostramos las donaciones del donante "+ donante.toString());
        if(donante.getDonaciones().hasMoreElements()){
            while(donante.getDonaciones().hasMoreElements()){
                System.out.println(donante.getDonaciones().nextElement().toString());
            } 
        } else{
            System.out.println("No hay donaciones registradas");
        }
        
    }
}