package pe.egcc.prueba;

import pe.egcc.service.CompService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   22/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {   
    System.out.println("Impuesto: " + CompService.calcImpuesto(100.0));
  }
  
}
