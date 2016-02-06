package clases;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 03-feb-2016
 */
public class Rectangulo {

    public double base, altura;

    public Rectangulo() {
        this.base = 1;
        this.altura = 2;
    }
    public double area(double base, double altura){
        return base*altura;
    }
    public double perimetro(double base, double altura){
        return 2*base+2*altura;
    }
}//fin clase
