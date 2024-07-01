import java.util.ArrayList;
import java.util.List;

public class Contactos extends Amigos {

    private List<Amigos> listaContactos;

    public Contactos() {
        listaContactos = new ArrayList<>();
    }

    public void agregarContacto(Amigos amigo) {
        listaContactos.add(amigo);
    }

    public void eliminarContacto(Amigos amigo) {
        listaContactos.remove(amigo);
    }

    public void compartirContactos(Contactos otroContacto) {
        for (Amigos amigo : listaContactos) {
            otroContacto.agregarContacto(amigo);
        }
    }

    public static void main(String[] args) {
        Contactos misContactos = new Contactos();
        Contactos otrosContactos = new Contactos();

        Amigos amigo1 = new Amigos("Juan", "Perez", "juan@example.com", "123456789", "Calle 123");
        Amigos amigo2 = new Amigos("Maria", "Lopez", "maria@example.com", "987654321", "Avenida 456");

        misContactos.agregarContacto(amigo1);
        misContactos.agregarContacto(amigo2);

        System.out.println("Mis contactos:");
        for (Amigos amigo : misContactos.listaContactos) {
            System.out.println("Nombre: " + amigo.getNombre());
            System.out.println("Apellido: " + amigo.getApellido());
            System.out.println("Email: " + amigo.getEmail());
            System.out.println("Teléfono: " + amigo.getNroDeTelefono());
            System.out.println("Dirección: " + amigo.getDireccioCasa());
            System.out.println();
        }

        System.out.println("Otros contactos antes de compartir:");
        for (Amigos amigo : otrosContactos.listaContactos) {
            System.out.println("Nombre: " + amigo.getNombre());
            System.out.println("Apellido: " + amigo.getApellido());
            System.out.println("Email: " + amigo.getEmail());
            System.out.println("Teléfono: " + amigo.getNroDeTelefono());
            System.out.println("Dirección: " + amigo.getDireccioCasa());
            System.out.println();
        }

        misContactos.compartirContactos(otrosContactos);

        System.out.println("Otros contactos después de compartir:");
        for (Amigos amigo : otrosContactos.listaContactos) {
            System.out.println("Nombre: " + amigo.getNombre());
            System.out.println("Apellido: " + amigo.getApellido());
            System.out.println("Email: " + amigo.getEmail());
            System.out.println("Teléfono: " + amigo.getNroDeTelefono());
            System.out.println("Dirección: " + amigo.getDireccioCasa());
            System.out.println();
        }
    }
}
