package ejemploexcepciones;


public class EjemploExcepciones {

    
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        try {
             System.out.println(matematica.dividir(5, 6));
             System.out.println(matematica.impuesto(4, 5));
             System.out.println(matematica.saludo("Carlos"));
        } catch (Exception e) {
            System.out.println("Error!!!");
        }
       
    }
}
