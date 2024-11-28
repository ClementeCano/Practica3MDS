import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        Refugio refugio = new Refugio();
        Voluntario voluntario = new Voluntario(new Date());
        voluntario.setRefugio(refugio);

        Animal animal = new Animal(new Date());
        Adoptante adoptante = new Adoptante(new Date());

        // Registrar el animal en el refugio
        voluntario.registrar(animal);

        // Tramitar la adopción del animal
        voluntario.tramitarAdopcion(animal, adoptante);

        // Imprimir los trámites realizados por el voluntario
        for (Adopcion adopcion : voluntario.getTramites()) {
            System.out.println("Adopción realizada: " + adopcion);
        }
    }
}