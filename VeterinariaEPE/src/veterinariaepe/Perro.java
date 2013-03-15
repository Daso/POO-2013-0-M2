
package veterinariaepe;


public class Perro extends Mascota{
    
    private int tamanho;

    public Perro(int tamanho, String nombre) {
        super(nombre);
        this.tamanho = tamanho;
    }

    
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecio() {
        return 10 * tamanho;
    }            
}
