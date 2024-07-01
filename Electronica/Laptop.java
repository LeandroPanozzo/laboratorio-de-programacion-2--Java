import java.io.Serializable;


public class Laptop implements Product, Serializable
{
    
    private int proce;
    private int pulgadas;
    
    //setter
    public void setProce(int proce){
        this.proce=proce;
    }
    

    
    public void setPulgadas(int pulgadas){
        this.pulgadas=pulgadas;
    }
    
    //getter
    public int getProce(){
        return proce;
    }
    

    
    public int getPulgadas(){
        return pulgadas;
    }
    
    public Laptop()
    {

    }
    
    public Laptop(int proce, int pulgadas){
        this.proce=proce;
        this.pulgadas=pulgadas;
    }

    public void obtenerPrecio(int pulgadas, int procesador){
        if(pulgadas>10&&pulgadas<15){
            switch(procesador){
                case 1:
                    System.out.println("el valor de la laptop de "+ pulgadas+" con procesador A10 es de $10000");
                    break;
                case 2:
                    System.out.println("el valor de la laptop de "+ pulgadas+" con procesador ryzen3 es de $15000");
                    break;
                case 3:
                    System.out.println("el valor de la laptop de "+ pulgadas+" con procesador ryzen5 es de $20000");
                    break;
                case 4:
                    System.out.println("el valor de la laptop de "+ pulgadas+" con procesador ryzen7 es de $30000");
                    break;
                default :
                    System.out.println("el valor ingresado es incorrecto");
                    break;
            
            }
        }else{
            if(pulgadas>15&&pulgadas<25){
                switch(procesador){
                case 1:
                    System.out.println("el valor de la laptop de "+ pulgadas+" pulgadas con procesador A10 es de $20000");
                    break;
                case 2:
                    System.out.println("el valor de la laptop de "+ pulgadas+" pulgadas con procesador ryzen3 es de $25000");
                    break;
                case 3:
                    System.out.println("el valor de la laptop de "+ pulgadas+" pulgadas con procesador ryzen5 es de $30000");
                    break;
                case 4:
                    System.out.println("el valor de la laptop de "+ pulgadas+" pulgadas con procesador ryzen7 es de $35000");
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
    
    public void descripcion(int pulgadas, int procesador){
        if(pulgadas>10&&pulgadas<15){
            switch(procesador){
                case 1:
                    System.out.println("la laptop de "+ pulgadas+" con procesador A10 es una compudora de gama baja y pantalla reducida del año" );
                    break;
                case 2:
                    System.out.println("la laptop de "+ pulgadas+" con procesador ryzen3 es una comptadora de gama media con pantalla reducida del año");
                    break;
                case 3:
                    System.out.println("la laptop de "+ pulgadas+" con procesador ryzen5 es una comptadora de gama media-alta con pantalla reducida del año" );
                    break;
                case 4:
                    System.out.println("la laptop de "+ pulgadas+" con procesador ryzen7 es una comptadora de gama alta con pantalla reducida del año");
                    break;
                default :
                    System.out.println("el valor ingresado es incorrecto");
                    break;
            
            }
        }else{
            if(pulgadas>15&&pulgadas<25){
                switch(procesador){
                case 1:
                    System.out.println("la laptop de "+ pulgadas+" con procesador A10 es una comptadora de gama baja con pantalla grande");
                    break;
                case 2:
                    System.out.println("la laptop de "+ pulgadas+" con procesador ryzen3 es una comptadora de gama media con pantalla grande");
                    break;
                case 3:
                    System.out.println("la laptop de "+ pulgadas+" con procesador ryzen5 es una comptadora de gama media-alta con pantalla grande");
                    break;
                case 4:
                    System.out.println("la laptop de "+ pulgadas+" con procesador ryzen7 es una comptadora de gama alta con pantalla grande");
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
