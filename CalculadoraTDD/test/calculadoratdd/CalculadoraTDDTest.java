/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratdd;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTDDTest {
   
    private CalculadoraTDD calculadora;
    
    public CalculadoraTDDTest() {
        calculadora = new CalculadoraTDD();
    }

    @Test
    public void siSumoTresYCuatroDebeDarmeSiete(){     
       Assert.assertEquals(7, calculadora.suma(3,4)); 
    }
    
    @Test
    public void siSumoCeroYMenosCuatroDebeDarmeMenosCuatro(){
        Assert.assertEquals(-4, calculadora.suma(0,-4)); 
    }
    
    @Test
    public void siRestoTresYCincoDebeDarmeMenosDos(){
         Assert.assertEquals(-2, calculadora.resta(3,5)); 
    }
    @Test
    public void siRestoOchoYCincoDebeDarmeTres(){
         Assert.assertEquals(3, calculadora.resta(8,5)); 
    }
     @Test
    public void siMultiplicoDosYTresDebeDarmeSeis(){
         Assert.assertEquals(6, calculadora.producto(2,3)); 
    }
      @Test
    public void siMultiplicoUnoYCuatroDebeDarmeCuatro(){
         Assert.assertEquals(4, calculadora.producto(1,4)); 
    }
      
    @Test
    public void siDividoNueveYTresDebeDarmeTres(){
         Assert.assertEquals(3, calculadora.divide(9,3)); 
    }
    
     @Test
    public void siDividoDoceYSeisDebeDarmeDos(){
         Assert.assertEquals(2, calculadora.divide(12,6)); 
    }
}
