package clases;

import service.Fechas;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 04-feb-2016
 */
public class Empleado extends Persona {
private double sueldo;
private double porcBonif=0.12;

    public Empleado(String nombres, Fechas fechaNac, double sueldo) {
        super(nombres, fechaNac);
        this.sueldo = sueldo;
        //this.porcBonif = 0.12;
    }

    public Empleado() {
        this.sueldo = 1000;
        //this.porcBonif = 0.12;
    }

   
    public String getEstado(){
       return super.getEstado()+","+getSueldo();
    }
    public double bonificacion(){
        return getSueldo() * porcBonif;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}//fin clase

