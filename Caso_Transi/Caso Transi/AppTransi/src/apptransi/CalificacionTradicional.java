/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apptransi;

/**
 *
 * @author pcsiecon
 */
public class CalificacionTradicional extends Calificacion {
    private double practica1;
    private double practica2;

    public CalificacionTradicional(double examenParcial, double examenFinal, double practica1, double practica2) {
        super(examenParcial, examenFinal);
        this.practica1 = practica1;
        this.practica2 = practica2;
    }

    @Override
    public double calcularPromedioFinal() {
        return  0.30*examenParcial +
                0.30*examenFinal +
                0.20*practica1 +
                0.20*practica2;
    }

    public double getPractica1() {
        return practica1;
    }

    public void setPractica1(double practica1) {
        this.practica1 = practica1;
    }

    public double getPractica2() {
        return practica2;
    }

    public void setPractica2(double practica2) {
        this.practica2 = practica2;
    }

}
