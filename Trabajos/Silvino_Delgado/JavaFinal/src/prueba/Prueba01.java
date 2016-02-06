package prueba;

import clases.Rectangulo;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 03-feb-2016
 */
public class Prueba01 {

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        System.out.println("Base: " + rect.base);
        System.out.println("Altura: " + rect.altura);
        System.out.println("Area es:" + rect.area(rect.base, rect.altura));
        System.out.println("Perimetro es:" + rect.perimetro(rect.base, rect.altura));
    }

}//fin clase
