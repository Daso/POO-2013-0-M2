/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apptransi;

/**
 *
 * @author pcsiecon
 */
public class CalificacionPractica extends Calificacion {

    private double trabajo1;
    private double trabajo2;
    private double proyecto;

    public CalificacionPractica(double examenParcial, double examenFinal, double trabajo1, double trabajo2, double proyecto) {
        super(examenParcial, examenFinal);
        this.trabajo1 = trabajo1;
        this.trabajo2 = trabajo2;
        this.proyecto = proyecto;
    }

    @Override
    public double calcularPromedioFinal() {
        return 0.15*examenParcial +
               0.25*examenFinal +
               0.10*trabajo1 +
               0.10*trabajo2 +
               0.40*proyecto;
    }

    /**
     * @return the trabajo1
     */
    public double getTrabajo1() {
        return trabajo1;
    }

    /**
     * @param trabajo1 the trabajo1 to set
     */
    public void setTrabajo1(double trabajo1) {
        this.trabajo1 = trabajo1;
    }

    /**
     * @return the trabajo2
     */
    public double getTrabajo2() {
        return trabajo2;
    }

    /**
     * @param trabajo2 the trabajo2 to set
     */
    public void setTrabajo2(double trabajo2) {
        this.trabajo2 = trabajo2;
    }

    /**
     * @return the proyecto
     */
    public double getProyecto() {
        return proyecto;
    }

    /**
     * @param proyecto the proyecto to set
     */
    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }

}
