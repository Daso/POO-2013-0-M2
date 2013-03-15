/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaepe;

import java.util.ArrayList;

/**
 *
 * @author pcsidsub
 */
public class VeterinariaEPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perro perro01 =  new Perro(1, "Rambo");
       System.out.println(perro01.calcularPrecio());
       
       Perro perro02 =  new Perro(3, "Fifi");
       System.out.println(perro02.calcularPrecio());
       
       Gato gato01 = new Gato("Loko");
       gato01.setEdad(8);
       System.out.println(gato01.calcularPrecio());
       
       
       Cliente cliente = new Cliente();
       cliente.agregarMascota(gato01);
       cliente.agregarMascota(perro01);
       ArrayList<Mascota>listaMascotas =  cliente.mostrarMascotas();
       
      for(Mascota element: listaMascotas){
                System.out.println(element.getNombre());
          }
    }
}
