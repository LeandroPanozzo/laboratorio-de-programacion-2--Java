import java.util.Scanner;
import java.util.InputMismatchException;
public class Interfaz
{
    public static void main(){
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("eliga una de las opciones");
        System.out.println("1- Recorrer enum de adelante hacia atras");
        System.out.println("2- Recorrer enum de atras hacia adelante");
        int opcion =0;
        try{
            opcion = teclado.nextInt();
        }catch(InputMismatchException e){
            System.out.println("ingreso un valor incorrecto");
        }
        
        
        Presedencia[] arreglo= Presedencia.values(); 
        
        switch(opcion){
            case 1: 
                for(int i =0; i<arreglo.length; i++){
                    System.out.println(arreglo[i]);
                }
                break;
                
            case 2:
                for(int i= arreglo.length-1; i>=0; i--){
                    System.out.println(arreglo[i]);
                }
                break;
                
            default :
                System.out.println("eligio una opcion incorrecta");
        
        
        }
    
    }
}
