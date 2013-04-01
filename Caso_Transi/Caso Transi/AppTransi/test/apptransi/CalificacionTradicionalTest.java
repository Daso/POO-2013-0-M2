package apptransi;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import apptransi.CalificacionTradicional;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class CalificacionTradicionalTest {

    public CalificacionTradicionalTest() {
    }


    @Test
    public void testCalcularPromedioFinal() {
        System.out.println("Calificacion Tradicional debe calcular promedio final");
        // Arrange
        double examenParcial = 15.00;
        double examenFinal = 13.00;
        double practica1 = 10.00;
        double practica2 = 12.00;

        CalificacionTradicional instance = new CalificacionTradicional(examenParcial, examenFinal, practica1, practica2);
        double expResult = 0.30*examenParcial +
                           0.30*examenFinal +
                           0.20*practica1 +
                           0.20*practica2;

        // Act
        double result = instance.calcularPromedioFinal();

        // Assert
        assertEquals(expResult, result, 0.0);

    }


}