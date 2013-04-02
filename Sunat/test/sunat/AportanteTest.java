/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sunat;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsidsub
 */
public class AportanteTest {
    private Aportante aportante;
    public AportanteTest() {
        this.aportante = new Aportante("Carlos"); 
    }


    
    @Test
    public void aportanteDebeTenerUnNombre(){
        Assert.assertNotNull(aportante.getNombre());
    }
    
    @Test
    public void aportanteDebeTenerUnArregloDeIngresos(){
        Assert.assertNotNull(aportante.getIngresos());
    }
    
    @Test
    public void aportanteDebePoderAgregarSuIngreso(){
        aportante.agregarIngreso("12 de Junio", 1000.00);
        ArrayList<Ingreso> ingresos =  aportante.getIngresos();       
        Assert.assertEquals(1000.00,ingresos.get(0).getTotal(),0.0);
    }
    
    @Test
    public void aportanteDebeCalcularSuTotal(){
       
    }
}
