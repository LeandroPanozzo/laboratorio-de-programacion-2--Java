import java.io.Serializable;

public class Perro implements Acciones, Serializable
{
    private String raza;
    private int edad;
    private String nombre;
    
    //getter
    public String getRaza(){
        return raza;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //setters
    public void setRaza(String raza){
        this.raza=raza;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public Perro()
    {
        // initialise instance variables
        
    }

    public Perro(String raza, int edad, String nombre)
    {
        this.raza=raza;
        this.edad=edad;
        this.nombre=nombre;
        //ecosistema donde coexistan ahora el perro y humano y que a futuro puedo ponerle mas animales aplicar en el escenario JavaBean,Interfaces y tratar excepsiones
        //JavaBean 2 clases (perro y uix) y planteado para que pueda ir agregando otras especies
        //tratar excepsiones bloques que fallan y poner exceptions
    }
    public boolean estaDurmiendo()
    {
        System.out.println(" esta durmiendo");
        return true;
    }
     
    public void caminar(){
        System.out.println(" esta caminando");
    
    }
     
    public void correr(){
        System.out.println(" esta corriendo");
    
    }
    
    public void saltar(){
        System.out.println(" esta saltando");
    
    }
    
}