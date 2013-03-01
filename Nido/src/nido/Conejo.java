
package nido;

public class Conejo {
   private String nombre;

    public Conejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   public String moverCola(){
       return "Soy el conejo " + nombre + " y muevo la cola";
   }
   
   public String acercarse(){
       return "Soy el conejo " + nombre + " y me estoy acercando";
   }
}
