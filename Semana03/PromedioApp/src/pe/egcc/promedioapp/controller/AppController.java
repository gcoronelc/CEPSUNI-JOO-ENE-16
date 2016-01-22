package pe.egcc.promedioapp.controller;

import pe.egcc.cepsuni.lib.Promedio;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 22/01/2016
 */
public class AppController {

  public int promediar(int n1, int n2) {
    Promedio promedio;
    promedio = new Promedio();
    return promedio.promediar(n1, n2);
  }

}
