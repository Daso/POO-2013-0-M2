
package ejemploexcepciones;


public class Matematica {
    
    public int dividir(int a, int b) throws Exception{
        
        int resultado = 0;                         
            resultado = a / b;                         
            return resultado;                                         
    }        
    
    public int impuesto(int a, int b) throws Exception{
        return a / b;
    }
    
    public String saludo(String nombre){
        return "Hola " + nombre;
    }
}
