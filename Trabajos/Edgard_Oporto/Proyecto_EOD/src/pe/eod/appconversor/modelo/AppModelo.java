package pe.eod.appconversor.modelo;

public class AppModelo {

    private double cambioS2D = 1/3.7;
    private double cambioD2S = 3.7;

    public double SaD(double soles){
        double dolares; 
        dolares = soles * cambioS2D;
        return dolares;
    }

    public double DaS(double dolares){
        double soles; 
        soles = dolares * cambioD2S;
        return soles;
    }

    public double getCambioS2D() {
        return cambioS2D;
    }

    public void setCambioS2D(double cambioS2D) {
        this.cambioS2D = cambioS2D;
    }

    public double getCambioD2S() {
        return cambioD2S;
    }

    public void setCambioD2S(double cambioD2S) {
        this.cambioD2S = cambioD2S;
    }

}

