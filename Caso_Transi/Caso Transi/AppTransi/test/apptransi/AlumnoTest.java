/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apptransi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class AlumnoTest {

    public AlumnoTest() {
    }


    @Test
    public void testAlumnoTieneUnaCalificacion() {
        System.out.println("Alumno debe tener una calificacion, y esta puede ser Tradicional o Practica");
        // Arrange
        String codigo1 = "a410091";
        String nombre1 = "Estanislao Contreras";
        String modalidad1 = "T";
        Alumno instance1 = new Alumno(codigo1, nombre1, modalidad1);

        String codigo2 = "a410095";
        String nombre2 = "Alex Perez";
        String modalidad2 = "P";
        Alumno instance2 = new Alumno(codigo2, nombre2, modalidad2);
        
        Calificacion calificacion1 = instance1.getCalificacion();
        Calificacion calificacion2 = instance2.getCalificacion();

        assertNotNull(calificacion1);
        assertNotNull(calificacion1.getClass().equals(CalificacionTradicional.class));

        assertNotNull(calificacion2);
        assertNotNull(calificacion2.getClass().equals(CalificacionPractica.class));

    }

}