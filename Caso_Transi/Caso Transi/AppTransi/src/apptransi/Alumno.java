/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apptransi;

/**
 *
 * @author pcsiecon
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private String modalidad;
    private Calificacion calificacion;

    public Alumno(String codigo, String nombre, String modalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modalidad = modalidad; // T-Tradicional P-Practica
        // Uso de objetos genericos para crear instancias especificas
        switch(modalidad.charAt(0)){
            case 'T':
                calificacion = new CalificacionTradicional(0.00, 0.00, 0.00, 0.00);
                break;
            case 'P':
                calificacion = new CalificacionPractica(0.00, 0.00, 0.00, 0.00, 0.00);
        }

    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the modalidad
     */
    public String getModalidad() {
        return modalidad;
    }


    /**
     * @return the calificacion
     */
    public Calificacion getCalificacion() {
        return calificacion;
    }



}
