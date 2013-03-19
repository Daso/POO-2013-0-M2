
package juegoadivina;

public class Jugador {
    private static int numero = 0;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
        Jugador.numero++;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
