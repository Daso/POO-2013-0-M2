
package juegoadivina;



public class JuegoAdivina {

    public static void main(String[] args) {
        Jugador jugador01 = new Jugador("Carlos");
        System.out.println(jugador01.getNumero());
        Jugador jugador02 = new Jugador("Katia");
        System.out.println(jugador02.getNumero());        
        System.out.println(Generador.operacion());     
        
        int edad = Integer.parseInt("14");
        double dinero =  Double.parseDouble("12.4");
    }
}
