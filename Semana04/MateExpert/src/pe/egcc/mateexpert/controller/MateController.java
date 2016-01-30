package pe.egcc.mateexpert.controller;

import pe.egcc.mateexpert.service.MyMath;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   22/01/2016
 */
public class MateController {

  public long factorial(int num) {
    return MyMath.factorial(num);
  }

  public int obtenerMcd(int num1, int num2) {
    return MyMath.mcd(num1, num2);
  }

  public int obtenerMcm(int num1, int num2) {
    return MyMath.mcm(num1, num2);
  }

}
