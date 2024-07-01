import java.io.Serializable;

public class PastorAleman implements Serializable
{
    // instance variables - replace the example below with your own
    private int x;

    private String nombre;
    private int años;
    private String color;
    
    //constructor por defecto
    public PastorAleman()
    {
       
    }
    //getter y setter
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getAños(){
        return años;
    }
    
    public void setAños(int años){
        this.años=años;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }

    public void olfatear(){
        System.out.println("El perro esta olfateando");
        
    }
    
    public void ladrar(){
        System.out.println("El perro esta ladrando");
        
    }
    
    public void perseguirLaPelota(){
        System.out.println("El perro esta persiguiendo la pelota");
        
    }
    
 
    public static void main(String[] args) {
        // Crear un objeto de la clase PastorAleman
        PastorAleman miPerro = new PastorAleman();
        miPerro.setNombre("manchita");
        miPerro.setAños(4);
        miPerro.setColor("Negro y marron");

        // Llamar a algunos métodos del objeto
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        System.out.println("Edad del perro: " + miPerro.getAños() + " años");
        System.out.println("Color del perro: " + miPerro.getColor());

        miPerro.olfatear();
        miPerro.ladrar();
        miPerro.perseguirLaPelota();
    }


}

