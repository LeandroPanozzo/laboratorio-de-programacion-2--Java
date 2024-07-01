import java.util.Scanner;

public class Venta
{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        Telefonos t= new Telefonos();
        Laptop l= new Laptop();
        
        System.out.println("ingrese 't' si desea ver los telefonos o 'l' para ver las laptops y cualquier otra tecla para salir");
        String opcion = teclado.nextLine().toLowerCase();
        
        switch(opcion){
            case "t":
                int cont=1;
                int cont2=1;
                System.out.println("elija que So desea");
                for(So so: So.values()){
                    System.out.println(cont+"-"+so);
                    cont++;
                
                }
                int so=0;
                try{
                    so=teclado.nextInt();
                }catch(Exception e){
                    System.out.println("ingreso un valor no numerico");
                }
                
                teclado.nextLine();
                
                System.out.println("elija que gama desea");
                for(EnumTelefono tel: EnumTelefono.values()){
                    System.out.println(cont2+"-"+tel);
                    cont2++;
                
                }
                int gama =0;
                try{
                    gama=teclado.nextInt();
                }catch(Exception e){
                    System.out.println("ingreso un valor no numerico");
                }
                
                
                t.setSo(so);
                t.setGama(gama);
                
                System.out.println("El precio sera:");
                t.obtenerPrecio(t.getSo(), t.getGama());
                System.out.println("Descripcion:");
                t.descripcion(t.getSo(), t.getGama());
                
                break;
                
                
            case "l":
                cont=1;
                cont2=1;
                System.out.println("elija qlas pulgadas (entre 10 y 25)");
                int pulgadas=0;
                try{
                    pulgadas=teclado.nextInt();
                }catch(Exception e){
                    System.out.println("ingreso un valor no numerico");
                }
                
                teclado.nextLine();
                
                System.out.println("elija que procesador desea");
                for(Procesador proce: Procesador.values()){
                    System.out.println(cont2+"-"+proce);
                    cont2++;
                
                }
                
                int proce=0;
                try{
                    proce=teclado.nextInt();
                }catch(Exception e){
                    System.out.println("ingreso un valor no numerico");
                }
                
                l.setPulgadas(pulgadas);
                l.setProce(proce);
                
                System.out.println("El precio sera:");
                l.obtenerPrecio(l.getPulgadas(), l.getProce());
                System.out.println("Descripcion:");
                l.descripcion(l.getPulgadas(), l.getProce());
                
                break;
                
            default :
                System.out.println("decidio salir");
                break;
                
                
        }
        
        
    }
}
