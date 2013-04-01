package apptransi;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import apptransi.Calificacion;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class CalificacionTest {

    public CalificacionTest() {
    }


    @Test
    public void testCalificacionTradicionalEsUnTipoDeCalificacion() {
        System.out.println("Calificacion Tradicional es un tipo de Calificacion");

        // Arrange
        double examenParcial = 15.00;
        double examenFinal = 13.00;
        double practica1 = 10.00;
        double practica2 = 12.00;

        // Act
        Calificacion instance = new CalificacionTradicional(examenParcial, examenFinal, practica1, practica2);
        double expResult = 0.30*examenParcial +
                           0.30*examenFinal +
                           0.20*practica1 +
                           0.20*practica2;
        double result = instance.calcularPromedioFinal();

        // Assert
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testCalificacionPracticaEsUnTipoDeCalificacion() {
        System.out.println("Calificacion Practica es un tipo de Calificacion");

        // Arrange
        double examenParcial = 15.00;
        double examenFinal = 13.00;
        double trabajo1 = 10.00;
        double trabajo2 = 12.00;
        double proyecto = 15.00;

        // Act
        Calificacion instance = new CalificacionPractica(examenParcial, examenFinal, trabajo1, trabajo2, proyecto);
        double expResult = 0.15*examenParcial +
                           0.25*examenFinal +
                           0.10*trabajo1 +
                           0.10*trabajo2 +
                           0.40*proyecto;
        double result = instance.calcularPromedioFinal();

        // Assert
        assertEquals(expResult, result, 0.0);

    }



}