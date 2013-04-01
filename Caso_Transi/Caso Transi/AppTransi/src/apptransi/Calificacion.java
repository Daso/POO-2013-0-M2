/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apptransi;

/**
 *
 * @author pcsiecon
 */
public abstract class Calificacion {
    protected double examenParcial;
    protected double examenFinal;

    public Calificacion(double examenParcial, double examenFinal) {
        this.examenParcial = examenParcial;
        this.examenFinal = examenFinal;
    }

    /**
     * @return the examenParcial
     */
    public double getExamenParcial() {
        return examenParcial;
    }

    /**
     * @param examenParcial the examenParcial to set
     */
    public void setExamenParcial(double examenParcial) {
        this.examenParcial = examenParcial;
    }

    /**
     * @return the examenFinal
     */
    public double getExamenFinal() {
        return examenFinal;
    }

    /**
     * @param examenFinal the examenFinal to set
     */
    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public abstract double calcularPromedioFinal();


}
