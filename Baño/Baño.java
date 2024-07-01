

public class Baño
{
    // instance variables - replace the example below with your own
    private boolean foco;
    
    public void setFoco(boolean foco){
        this.foco=foco;
    
    }
    
    public boolean getFoco(){
        return foco;
    }

    public Baño()
    {
        
    }
    
    public Baño(boolean foco){
        this.foco=foco;
    
    }

    public void encenderFoco(boolean foco){
        if(foco){
            System.out.println("la luz esta encedida");
        }else{
            System.out.println("el foco no esta encedido");
        }
    
    }
}
