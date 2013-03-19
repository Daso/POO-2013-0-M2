
package juegoadivina;

public class Generador {
    
    public static String operacion(){
        int a = (int)Math.round((Math.random() * 2));
        int b = (int)Math.round((Math.random() * 2));
        return a + " + " + b + " = ";
        
    }        
}
