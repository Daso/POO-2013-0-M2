
package matricula;

public class Alumno {
    private String codigo;
    private String nombre;
    private int nota;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public String saludar(){
        return "Hola soy " + nombre;                
    }
    
    
}
