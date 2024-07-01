
import java.io.Serializable;
public class Amigos implements Serializable{
    
    //atributos
    
    private String nombre;
    private String apellido;
    private String email;
    private String nroDeTelefono;
    private String direccioCasa;

    public Amigos() {
    }

    public Amigos(String nombre, String apellido, String email, String nroDeTelefono, String direccioCasa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nroDeTelefono = nroDeTelefono;
        this.direccioCasa = direccioCasa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNroDeTelefono() {
        return nroDeTelefono;
    }

    public void setNroDeTelefono(String nroDeTelefono) {
        this.nroDeTelefono = nroDeTelefono;
    }

    public String getDireccioCasa() {
        return direccioCasa;
    }

    public void setDireccioCasa(String direccioCasa) {
        this.direccioCasa = direccioCasa;
    }
    
    
    
    
}
