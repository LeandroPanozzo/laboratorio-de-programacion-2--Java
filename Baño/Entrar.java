import java.util.Scanner;
import java.util.InputMismatchException;


public class Entrar
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        lavabo l = new lavabo();
        Inodoro i = new Inodoro();
        Ducha d = new Ducha();
        boolean foco=false;
        boolean grifo = false;
        boolean ocu=false;
        String encender;
        String ocupar;
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la accion que desea realizar");
        int cont =1;
        for(acciones acc: acciones.values()){
            System.out.println(cont+" - "+acc);
            cont++;
        }
        try{
            opcion = teclado.nextInt();
            teclado.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Error: no escribio un numero");
        }
        
        
        switch(opcion){
            case 1:
                
                
                System.out.println("ingrese s si desea encender la luz");
                 encender= teclado.nextLine().toLowerCase();
                if(encender.equals("s")){
                    foco=true;
                    d.setFoco(foco);
                }
                System.out.println("ingrese s si desea abrir la canilla");
                String abrir = teclado.nextLine().toLowerCase();
                if(abrir.equals("s")){
                    grifo=true;
                    d.setGrifo(grifo);
                }
                
                d.Bañarse(d.getFoco(),d.getGrifo());
            
                break;
            
                
            case 2:
                
                System.out.println("ingrese s si desea encender la luz");
                encender = teclado.nextLine().toLowerCase();
                if(encender.equals("s")){
                    foco=true;
                    i.setFoco(foco);
                }
                System.out.println("ingrese s si desea ocupar el inodoro");
                 ocupar= teclado.nextLine().toLowerCase();
                if(ocupar.equals("s")){
                    ocu=true;
                    i.setOcupar(ocu);
                }
                i.Utilizar(i.getOcupar(),i.getFoco());
                
                break;
            
            case 3:
               
                System.out.println("ingrese s si desea encender la luz");
                encender = teclado.nextLine().toLowerCase();
                if(encender.equals("s")){
                    foco=true;
                    l.setFoco(foco);
                }
                System.out.println("ingrese s si desea ocupar el lavabo");
                ocupar = teclado.nextLine().toLowerCase();
                if(ocupar.equals("s")){
                    ocu=true;
                    l.setUtilizar(ocu);
                }
                l.UtilizarLavabo(l.getUtilizar(),l.getFoco());
                break;
                
            default :
                System.out.println("Opcion elegida incorrecta");
                break;
                
        }
        
    
    }
}
