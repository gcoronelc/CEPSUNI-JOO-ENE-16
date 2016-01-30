package pe.egcc.prueba;

import pe.egcc.modelo.Clase1;
import pe.egcc.modelo.Clase2;
import pe.egcc.modelo.Clase3;
import pe.egcc.modelo.Clase4;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public class Prueba03 {

  public static void main(String[] args) {
    Clase2 obj = new Clase2();
    System.out.println("Compatible con Clase1: " + ((obj instanceof Clase1)?"SI":"NO"));
    System.out.println("Compatible con Clase2: " + ((obj instanceof Clase2)?"SI":"NO"));
    System.out.println("Compatible con Clase3: " + ((obj instanceof Clase3)?"SI":"NO"));
    System.out.println("Compatible con Clase4: " + ((obj instanceof Clase4)?"SI":"NO"));
  }
}
