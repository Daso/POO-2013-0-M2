
package veterinariaepe;


public class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio() {
        return 25 + edad;
    }
    
}
