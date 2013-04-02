/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sunat;


public class Ingreso {
    private String fecha;
    private double total;

    public Ingreso() {
    }

    
    public Ingreso(String fecha, double total) {
        this.fecha = fecha;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }
    
    
    
}
