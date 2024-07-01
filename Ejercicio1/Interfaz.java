import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz  
{
    
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        
        Humano h= new Humano();
        Perro p= new Perro();
        
        System.out.println("ingrese el nombre del Humano: ");
        String nombreHumano=teclado.nextLine();
        System.out.println("ingrese el apellido del Humano: ");
        String apellidoHumano=teclado.nextLine();
        System.out.println("ingrese el genero del Humano: ");
        String generoHumano=teclado.nextLine();
        System.out.println("ingrese la edad del Humano: ");
        int edadHumano=teclado.nextInt();
        
         teclado.nextLine();
        
        h.setNombre(nombreHumano);
        h.setApellido(apellidoHumano);
        h.setGenero(generoHumano);
        h.setEdad(edadHumano);
    
        System.out.println("ingrese el nombre del perro: ");
        String nombrePerro=teclado.nextLine();
        System.out.println("ingrese la raza del perro");
        String razaPerro=teclado.nextLine();
        System.out.println("ingrese la edad del perro: ");
        int edadPerro=teclado.nextInt();
        
        p.setNombre(nombrePerro);
        p.setRaza(razaPerro);
        p.setEdad(edadPerro);
        
        String inputLine;
        String opcion2= "si";
        while("si".equals(opcion2)){
        System.out.println("elige de que ser vivo quieres realizar las acciones: ");
        System.out.println("1- Humano");
        System.out.println("2- Perro");
        System.out.println("3- Salir");
        
        
            try{
                int opcion= teclado.nextInt();
            switch(opcion){
                case 1:
            
                System.out.println("eligio humano");
                
                        System.out.println("elija que accion desea realizar");
                        System.out.println("1- hablar");
                        System.out.println("2- correr");
                        System.out.println("3- caminar");
                        System.out.println("4- saltar");
                        System.out.println("5- trabajar");
                
                        int opcion3= teclado.nextInt();
                        switch(opcion3){
                        case 1:
                            System.out.print("El humano"+ h.getNombre()+ " "+ h.getApellido()+ " ");
                             h.hablando();
                            break;
                
                        case 2:
                            System.out.print("El humano"+ h.getNombre()+ " "+ h.getApellido()+ " ");
                            h.correr();
                            break;
                    
                        case 3:
                            System.out.print("El humano"+ h.getNombre()+ " "+ h.getApellido()+ " ");
                            h.caminar();
                            break;
                        
                        case 4:
                            System.out.print("El humano"+ h.getNombre()+ " "+ h.getApellido()+ " ");
                            h.saltar();
                            break;
                    
                        case 5: 
                            System.out.print("El humano"+ h.getNombre()+ " "+ h.getApellido()+ " ");
                            h.trabajando();
                            break;
                        
                        default :
                            System.out.println("opcion incorrecta");
                            break;
                    }
                
                break;
            
        
             case 2:
                System.out.println("Eligion perro");
                    System.out.println("elija que accion desea realizar");
                        System.out.println("1- Dormir");
                        System.out.println("2- correr");
                        System.out.println("3- caminar");
                        System.out.println("4- saltar");
                        opcion3=teclado.nextInt();
                        switch(opcion3){
                            case 1:
                                System.out.print("El perro "+ p.getNombre()+ " de la raza "+ p.getRaza()+ " ");
                                p.estaDurmiendo();
                                break;
                            case 2:
                                System.out.print("El perro "+ p.getNombre()+ " de la raza "+ p.getRaza()+ " ");
                                p.correr();
                                break;
                            case 3:
                                System.out.print("El perro "+ p.getNombre()+ " de la raza "+ p.getRaza()+ " ");
                                p.caminar();
                                break;
                            case 4:
                                System.out.print("El perro "+ p.getNombre()+ " de la raza "+ p.getRaza()+ " ");
                                p.saltar();
                                break;
                            default :
                                System.out.println("Eligio una opcion incorrecta");
                                break;
                    
                        }
             break;
            
             default:
                System.out.println("Opción no válida.");
                break;
            }
            
            
            }catch(InputMismatchException e){
                System.out.println("Ingrese un numero valido");
                teclado.nextLine();
            }
            teclado.nextLine(); //limpio el buffer
            System.out.println("si desea continuar ingrese 'si'");
            inputLine = teclado.nextLine(); 
            opcion2 = inputLine;
        }
    }
}