package apptransi;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import apptransi.CalificacionPractica;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class CalificacionPracticaTest {

    public CalificacionPracticaTest() {
    }

    @Test
    public void testCalcularPromedioFinal() {
        System.out.println("Calificación Práctica debe calcular Promedio Final");
        // Arrange

        double examenParcial = 14.00;
        double examenFinal = 10.00;
        double trabajo1 = 18.00;
        double trabajo2 = 16.00;
        double proyecto = 13.00;

        CalificacionPractica instance = new CalificacionPractica(examenParcial, examenFinal, trabajo1, trabajo2, proyecto);
        double expResult = 0.15*examenParcial +
                           0.25*examenFinal +
                           0.10*trabajo1 +
                           0.10*trabajo2 +
                           0.40*proyecto;
        // Act
        double result = instance.calcularPromedioFinal();
        // Assert
        assertEquals(expResult, result, 0.0);

    }


}