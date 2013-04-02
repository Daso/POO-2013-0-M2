
package sunat;

import java.util.ArrayList;


public class Aportante {
   private String nombre;
   private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
   private double total;
    public Aportante() {
    }

    public Aportante(String nombre) {
        this.nombre = nombre;
    }
    
    
    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public double getTotal() {
        return total;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void agregarIngreso(String fecha, double monto) {
        ingresos.add(new Ingreso(fecha, monto));
    }
    
    
    
    
}
