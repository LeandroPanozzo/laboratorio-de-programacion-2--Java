import java.io.Serializable;
import java.util.Scanner;


public class Rombo implements Serializable
{
    private double lado1;
    private double anguloRad;
    private double superficie;

    
    public Rombo()
    {
        
    }
    
    public Rombo(double lado1, double anguloRad, double superficie){
        this.lado1=lado1;
        this.anguloRad=anguloRad;
        this.superficie=superficie;
    }

    //setter
    
    public void setLado1(double lado1){
        this.lado1=lado1;
        this.superficie = Calcular(lado1, anguloRad);
    }
    
    public void setAnguloRad(double anguloRad){
        this.anguloRad=anguloRad;
        this.superficie = Calcular(lado1, anguloRad);
    }
    
   
    //getter
    
    
    public double getLado1(){
        return lado1;
    }
    
    public double getAnguloRad(){
        return anguloRad;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    
    //metodo
    
    public double Calcular(double lado1, double anguloRad){
        return lado1*lado1*Math.sin(anguloRad);
        
    }
    
    
    public static void main(String[] args){
        Rombo r= new Rombo();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese el lado del rombo");
        double lado = teclado.nextDouble();
        r.setLado1(lado);
        
        System.out.println("ingrese el angulo del rombo");
        double angulo = teclado.nextDouble();
        angulo = Math.toRadians(angulo);
        r.setAnguloRad(angulo);
        
        System.out.println("La superficie del Rombo es: "+ r.getSuperficie());
        
        
    
    }
}
