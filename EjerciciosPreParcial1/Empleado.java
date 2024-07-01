import java.io.Serializable;
import java.util.List;
public class Empleado implements CalcularSueldos, Serializable {

    private int id;
    private String nombre;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    public int SueldoMenor(List<Empleado> empleados){
        if(empleados.isEmpty()){
            return 0;
        
        }
        
        int salarioMinimo= empleados.get(0).getSalario();
        
        for(Empleado empleado : empleados){
            if(empleado.getSalario()<salarioMinimo){
                salarioMinimo=empleado.getSalario();
            }
        }
        return salarioMinimo;
    }
    
    public int SumaSueldos(List<Empleado> empleados){
        int sumaSueldos=0;
        int limite = Math.min(empleados.size(), 6);
        
        for(int i=0; i<limite;i++){
            sumaSueldos +=empleados.get(i).getSalario();
        
        }
        return sumaSueldos;
    }
    
    
}
