/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apptransi;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class TransiTest {

    public TransiTest() {
    }


    @Test
    public void testTransiTieneNAlumnos() {
        System.out.println("Transi tiene alumnos registrados");
        // Arrange
        Transi instance = new Transi();
        // Act
        ArrayList result = instance.getAlumnos();
        // Assert
        assertNotNull(result);
    }

    @Test
    public void testTransiDebeRegistrarAlumnoConModalidadTradicional(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeRegistrarAlumnoConModalidadPractica(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeEliminarPorCodigo(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeRegistrarCalificacionTradicional(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeRegistrarCalificacionPractica(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeCalcularPromedioDelSalon(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeObtenerElPromedioFinalMayor(){
        fail("To be completed at home");
    }

    @Test
    public void testTransiDebeObtenerElPromedioFinalMenor(){
        fail("To be completed at home");
    }

}