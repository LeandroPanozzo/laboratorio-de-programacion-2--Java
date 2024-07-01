import java.io.Serializable;


public class Telefonos implements Product, Serializable
{
    
    private int so;
    private int gama;
    
    //setter
    public void setSo(int so){
        this.so=so;
    }
    
    
    public void setGama(int gama){
        this.gama=gama;
    }
    
    //getter
    public int getSo(){
        return so;
    }

    
    public int getGama(){
        return gama;
    }


    public Telefonos()
    {
       
    }
    
    public Telefonos(int so, int gama){
        this.so=so;
        this.gama=gama;
    }

    public void obtenerPrecio(int so, int gama){
        if(so==1){
            switch(gama){
                case 1:
                    System.out.println("el telefono con sistema operativo IOs de gama baja tiene un valor de $1000");
                    break;
                case 2:
                    System.out.println("el telefono con sistema operativo IOs de gama media tiene un valor de $1500");
                    break;
                case 3:
                    System.out.println("el telefono con sistema operativo IOs de gama baja tiene un valor de $2000");
                    break;
                default :
                    System.out.println("el valor ingresado es incorrecto");
                    break;
            
            }
        }else{
            if(so==2){
                switch(gama){
                case 1:
                    System.out.println("el telefono con sistema operativo Android de gama baja tiene un valor de $1000");
                    break;
                case 2:
                    System.out.println("el telefono con sistema operativo Android de gama media tiene un valor de $1500");
                    break;
                case 3:
                    System.out.println("el telefono con sistema operativo Android de gama baja tiene un valor de $2000");
                    break;
                default :
                    System.out.println("el valor ingresado es incorrecto");
                    break;
                }
            
            }else{
                System.out.println("valor ingresado es incorrecto");
            }
        }
    
    }
    
    public void descripcion(int so, int gama){
        if(so==1){
            switch(gama){
                case 1:
                    System.out.println("el telefono con sistema operativo IOs de gama baja y potencia y camara reducidas");
                    break;
                case 2:
                    System.out.println("el telefono con sistema operativo IOs de gama media y potencia y camara aceptable");
                    break;
                case 3:
                    System.out.println("el telefono con sistema operativo IOs de gama alta y potencia y camara potentes");
                    break;
                default :
                    System.out.println("el valor ingresado es incorrecto");
                    break;
            
            }
        }else{
            if(so==1){
                switch(gama){
                case 1:
                    System.out.println("el telefono con sistema operativo android de gama baja y potencia y camara reducidas");
                    break;
                case 2:
                    System.out.println("el telefono con sistema operativo android de gama media y potencia y camara aceptable");
                    break;
                case 3:
                    System.out.println("el telefono con sistema operativo android de gama alta y potencia y camara potentes");
                    break;
                default :
                    System.out.println("el valor ingresado es incorrecto");
                    break;
                }
            
            }else{
                System.out.println("valor ingresado es incorrecto");
            }
        }
    }

    
}
