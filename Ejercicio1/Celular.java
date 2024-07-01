

import java.io.Serializable;

public class Celular implements Serializable
{
private String marca;
private String modelo;
private String color;

//constructor vacio
public Celular(){
    
}
    // constructor con parámetros
public Celular(String marca, String modelo, String color) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
}

//getters y Setters
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}

    // método hacer llamada
public void llamar(String nombre){
System.out.println("LLamando a "+nombre);
}
    //método finalizar llamada
public void cortarLlamada(){
System.out.println("Llamada finalizada");
}
    //método finalizar llamada

    //método para informar de la caracteristicas del celular
public void informarCaracteristicas(){
System.out.println(String.format("Celular Marca: %s", marca));
System.out.println(String.format("Celular  Modelo: %s", modelo));
System.out.println(String.format("Celular Color: %s", color));
}        

public static void main(String[] args) {
    //creo un nuevo objeto de tipo celular, con el constructor vacío
    Celular celular = new Celular("Nokia","1100","Gris");
    celular.llamar("Leandro");
    celular.cortarLlamada();
    System.out.println();
    celular.informarCaracteristicas();
    }



}

