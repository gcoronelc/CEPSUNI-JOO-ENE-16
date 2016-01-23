package pe.egcc.mateexpert.prueba;

import pe.egcc.mateexpert.service.MyMath;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   22/01/2016
 */
public class Prueba01 {

  public static void main(String[] args) {
    for(int i = 0; i <= 10; i++){
      String dato = "Factorial de " + i + " es " + MyMath.factorial(i);
      System.out.println(dato);
    }
  }
}
