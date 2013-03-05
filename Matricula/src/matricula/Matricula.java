
package matricula;


public class Matricula {

    public static void main(String[] args) {
      
     Alumno alumno1 = new Alumno("001", "Pepe");
     Alumno alumno2 = new Alumno("002", "Sonia");
     Alumno alumno3 = new Alumno("003", "Miguel");
        
     System.out.println(alumno1.saludar());   
     System.out.println(alumno2.saludar());
     System.out.println(alumno3.saludar());
                
        
    }
}
