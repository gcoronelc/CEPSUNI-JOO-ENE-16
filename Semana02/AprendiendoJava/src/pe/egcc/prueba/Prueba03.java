package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class Prueba03 {

  public static void main(String[] args) {
    MateService mateService = new MateService();
    System.out.println("Patencia 1: " + mateService.getPotencia(2, 6));
    System.out.println("Patencia 2: " + mateService.getPotencia(2.0, 6));
  }
  
}
