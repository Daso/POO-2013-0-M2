/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sunat;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsidsub
 */
public class IngresoTest {
    private Ingreso ingreso;
    
    public IngresoTest() {
        ingreso = new Ingreso();
    }

   @Test
    public void deboPoderCrearUnIngreso(){
        Assert.assertNotNull(new Ingreso("12 de Julio", 2000.00));
    }
   
   
}
