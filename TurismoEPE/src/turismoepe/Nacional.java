
package turismoepe;


public class Nacional extends Turista{
    private String DNI;

    public Nacional(String DNI, String nombre, String apellido) {
        super(nombre, apellido);
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
                
    @Override
    public void calcularTarifa(int dia) {
        this.tarifa = 50 * dia;
    }
    
    public String saludo(){
        return "Hola, mi nombre es: " + nombre + " " + apellido ;
    }
}