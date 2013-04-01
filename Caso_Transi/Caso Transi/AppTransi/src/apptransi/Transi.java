/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apptransi;

import java.util.ArrayList;

/**
 *
 * @author pcsiecon
 */
public class Transi {

    private ArrayList<Alumno> alumnos;

    public Transi() {
        alumnos = new ArrayList<Alumno>();
    }

    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void registrarAlumno(String codigo, String nombre, String modalidad) {
        this.alumnos.add(new Alumno(codigo, nombre, modalidad));
    }

    public Alumno buscarAlumno(String codigoAlumno) {
        Alumno alumnoEncontrado = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigoAlumno)) {
                alumnoEncontrado = alumno;
                break;
            }
        }
        return alumnoEncontrado;
    }

    public void eliminarAlumno(String codigoAlumno) {
        Alumno alumno = buscarAlumno(codigoAlumno);
        alumnos.remove(alumno);
    }

    public double calcularPromedioFinalMayor() {
        double promedioMayor = 0.0;
        for (Alumno alumno : alumnos) {
            double promedioAlumno = alumno.getCalificacion().calcularPromedioFinal();
            if (promedioAlumno > promedioMayor) {
                promedioMayor = promedioAlumno;
                break;
            }
        }
        return promedioMayor;
    }

    public double calcularPromedioFinalMenor() {
        double promedioMenor = calcularPromedioFinalMayor();
        for (Alumno alumno : alumnos) {
            double promedioAlumno = alumno.getCalificacion().calcularPromedioFinal();
            if (promedioAlumno < promedioMenor) {
                promedioMenor = promedioAlumno;
                break;
            }
        }
        return promedioMenor;
    }

    public double calcularPromedioSalon() {
        double promedioSalon = 0.0;
        if (!alumnos.isEmpty()) {
            for (Alumno alumno : alumnos) {
                promedioSalon += alumno.getCalificacion().calcularPromedioFinal();
            }
            promedioSalon = promedioSalon / alumnos.size();
        }
        return promedioSalon;
    }

    public boolean registrarCalificacionTradicional(String codigoAlumno, double examenParcial, double examenFinal, double practica1, double practica2) {
        Alumno alumno = buscarAlumno(codigoAlumno);
        if (alumno != null) {
            alumno.getCalificacion().setExamenParcial(examenParcial);
            alumno.getCalificacion().setExamenFinal(examenFinal);
            ((CalificacionTradicional) alumno.getCalificacion()).setPractica1(practica1);
            ((CalificacionTradicional) alumno.getCalificacion()).setPractica2(practica2);
            return true;

        } else {
            return false;
        }
    }

    public boolean registrarCalificacionPractica(String codigoAlumno, double examenParcial, double examenFinal, double trabajo1, double trabajo2, double proyecto) {
        Alumno alumno = buscarAlumno(codigoAlumno);
        if (alumno != null) {
            alumno.getCalificacion().setExamenParcial(examenParcial);
            alumno.getCalificacion().setExamenFinal(examenFinal);
            ((CalificacionPractica) alumno.getCalificacion()).setTrabajo1(trabajo1);
            ((CalificacionPractica) alumno.getCalificacion()).setTrabajo2(trabajo2);
            ((CalificacionPractica) alumno.getCalificacion()).setProyecto(proyecto);
            return true;

        } else {
            return false;
        }
    }
}
