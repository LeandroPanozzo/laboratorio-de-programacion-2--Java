import java.io.Serializable;


public class Inodoro extends Baño implements ocupar, Serializable
{
    private boolean ocupar;
    
    public void setOcupar(boolean ocupar){
        this.ocupar=ocupar;
    }
    
    public boolean getOcupar(){
        return ocupar;
    }
    
    public Inodoro()
    {
        
    }
    
    public Inodoro(boolean ocupar){
        this.ocupar=ocupar;
    }
    
    public void entrar(){

            System.out.println("ingreso al baño");
        
        
    }
    
    public void Utilizar(boolean ocupar, boolean foco){
        entrar();
        encenderFoco(foco);
        
        if(ocupar&&foco){
            System.out.println("Se ocupo el Inodoro");
        }else{
            System.out.println("todavia no es apto para utilizar el lavabo");
        }
    
    
    }
}
