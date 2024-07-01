import java.io.Serializable;

public class Humano implements Acciones, Serializable
{
    
    private int edad;
    private String nombre;
    private String apellido;
    private String genero;
    
    //getters
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }

    /**
     * Constructor for objects of class Humano
     */
    public Humano()
    {
        
    }
    
    public Humano(int edad, String nombre, String apellido, String genero){
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
    
    }

    public void hablando(){
    
        System.out.println("Esta hablando");
    }
    
    public void trabajando(){
    
        System.out.println("Esta trabajando");
    }
    
    public void correr(){
        System.out.println("Esta corriendo");
    }
    
    public void caminar(){
        System.out.println("Esta caminando");
    }
    
    public void saltar(){
        System.out.println("Esta saltando");
    }
    
}
