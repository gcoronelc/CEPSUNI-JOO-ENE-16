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

  private Promedio promedio;

  public AppController() {
    promedio = new Promedio();
  }

  public int promediar(int n1, int n2) {
    return promedio.promediar(n1, n2);
  }

  public int promediar(int n1, int n2, int n3) {
    return promedio.promediar(n1, n2, n3);
  }

  public int promediar(int n1, int n2, int n3, int n4) {
    return promedio.promediar(n1, n2, n3, n4);
  }

  public int promediar(int n1, int n2, int n3, int n4, int n5) {
    return promedio.promediar(n1, n2, n3, n4, n5);
  }

}
