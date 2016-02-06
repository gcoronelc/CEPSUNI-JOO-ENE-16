package pe.egcc.app.prueba;

import pe.egcc.app.espec.IMate;
import pe.egcc.app.model.MateImpl1;
import pe.egcc.app.model.MateImpl2;
import pe.egcc.app.model.MateImpl3;

public class Prueba02 {

  public static void main(String[] args) {
    IMate var = new MateImpl3();
    
    System.out.println("10 + 4 = " + var.sumar(10, 4));
    
  }
  
}
