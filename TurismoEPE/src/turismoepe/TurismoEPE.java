
package turismoepe;

public class TurismoEPE {

    public static void main(String[] args) {
      Nacional turista01 =  new Nacional("09876543", "Galvez", "Montero");
      Internacional turista02 = new Internacional("Calrol", "Swaarf", "093");
      Turista turista03 = new Internacional("Olga", "Pillo2", "093");
      Turista turista04 = new Nacional("09444", "Cinthya", "Piedra");
      
      
      turista01.calcularTarifa(5);
      System.out.println(turista01.getTarifa());
      
      turista03.calcularTarifa(10);
      System.out.println(turista03.getTarifa());
      
      turista04.calcularTarifa(7);
      System.out.println(turista04.getTarifa());
    }
}
