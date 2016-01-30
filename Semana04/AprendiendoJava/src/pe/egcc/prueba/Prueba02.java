package pe.egcc.prueba;

import pe.egcc.modelo.Clase1;
import pe.egcc.modelo.Clase4;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {
    Clase1 objA = new Clase4();
    Clase4 objB = (Clase4) objA;
    objB.mostrarCurso();
  }
  
}
