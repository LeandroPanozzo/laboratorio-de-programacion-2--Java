import java.io.Serializable;


public class lavabo extends Baño implements ocupar, Serializable
{
    // instance variables - replace the example below with your own
    private boolean utilizar;

    public boolean getUtilizar(){
        return utilizar;
    }
    
    public void setUtilizar(boolean utilizar){
        this.utilizar=utilizar;
    }
    
    
    public lavabo()
    {
        
    }
    
    public lavabo(boolean utilizar){
        this.utilizar= utilizar;
    }
    
    public void entrar(){

            System.out.println("ingreso al baño");
        
    }

    public void UtilizarLavabo(boolean utilizar, boolean foco){
        entrar();
        encenderFoco(foco);
        
        if(utilizar&&foco){
            System.out.println("Se utilizo el lavabo");
        }else{
            System.out.println("Todavia no es apto para utilizar el lavabo");
        }
    }
}
