
package turismoepe;


public class Internacional extends Turista{
    private String pasaporte;
    private String pais;
    
    public Internacional(String nombre, String apellido, String pasaporte) {
        super(nombre, apellido);
        this.pasaporte = pasaporte;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }   
    
    @Override
    public void calcularTarifa(int dia) {
        this.tarifa = 250 * dia + 35;
    }
    
}
