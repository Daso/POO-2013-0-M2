
package turismoepe;

import java.util.ArrayList;


public class Tour {
    private String codigo;
    private ArrayList<Turista> turistas = new ArrayList<Turista>();
    private double total;
    
    public Tour(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Turista> getTuristas() {
        return turistas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
            
    
    
    public void agregarTurista(Turista turista){
        this.turistas.add(turista);        
    }
    
    public void tarifaTotal(){        
           for(Turista element: this.turistas){
                this.total += element.tarifa;
          }
    }
    
    
}
