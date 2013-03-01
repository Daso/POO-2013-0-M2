
package nido;

public class Persona {
    private String nombre;
    private int edad;
    private Conejo conejoAsignado;

    public Persona(String nombre, String nombreConejo) {
        this.nombre = nombre;
        this.conejoAsignado = new Conejo(nombreConejo);
    }

    public void setConejoAsignado(Conejo conejoAsignado) {
        this.conejoAsignado = conejoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String mostrarZahanoria(){
        String mensaje = "Hola soy " + nombre +
                " y el conejo me dice: " + conejoAsignado.acercarse();
        
        return mensaje;
    }
    
    public String tocarOreja(){
        String mensaje = "Hola soy " + nombre + 
                " y el conejo me dice: " + conejoAsignado.moverCola() ;
        return mensaje;
    }    
}
