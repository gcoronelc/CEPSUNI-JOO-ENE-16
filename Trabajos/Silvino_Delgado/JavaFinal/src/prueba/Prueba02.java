package prueba;

import service.Fechas;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 04-feb-2016
 */
public class Prueba02 {
    public static void main(String[] args) {
        Fechas f;
        f = new Fechas(20,2,1970);    
    
       if (f.validafecha() ) {
           System.out.println("Fecha: "+f.getFecha());
       }else 
           System.out.println("Error");
    }
    
} //fin clase
