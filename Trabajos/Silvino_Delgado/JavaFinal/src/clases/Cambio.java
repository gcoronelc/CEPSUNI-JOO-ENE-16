package clases;
/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 03-feb-2016
 */
public class Cambio {
private double tcambio=3.45;

public double aDolar(double soles) {
        return soles / getTcambio();
    }
 public double aSol(double dolares){
        return dolares*getTcambio();
    }

    /**
     * @return the tcambio
     */
    public double getTcambio() {
        return tcambio;
    }

    /**
     * @param tcambio the tcambio to set
     */
    public void setTcambio(double tcambio) {
        this.tcambio = tcambio;
    }
}//fin clase
