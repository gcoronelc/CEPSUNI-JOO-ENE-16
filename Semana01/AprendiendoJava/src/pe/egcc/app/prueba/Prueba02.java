package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   08/01/2016
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    MateService mateService;
    mateService = new MateService();
    int r = mateService.multiplicar(5, 7);
    System.out.println("Producto: " + r);
  }

}
