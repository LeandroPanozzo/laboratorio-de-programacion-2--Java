import java.io.Serializable;


public class Ducha extends Baño implements ocupar, Serializable
{
    // instance variables - replace the example below with your own
    private boolean grifo;
    
    public void setGrifo(boolean grifo){
        this.grifo= grifo;
    }
    
    
    public boolean getGrifo(){
        return grifo;
        
    }
    

    public Ducha()
    {
        
    }
    
    public Ducha(boolean grifo){
        this.grifo= grifo;
    }
    
    public void entrar(){
        
            System.out.println("accedio al baño");
        
        
        
    }
    
    public void AbrirGrifo(boolean grifo){
        if(grifo){
            System.out.println("esta cayendo agua, canilla abierta");
        }else{
            System.out.println("la canilla esta cerrada");
        }
    }
    
    public void Bañarse(boolean grifo, boolean foco){
        entrar();
        encenderFoco(foco);
        AbrirGrifo(grifo);
            if(grifo&&foco){
            System.out.println("ya es apto para ducharse");
        }else{
            System.out.println("todavia no es apto para ducharse");
        }
    }
    
}
