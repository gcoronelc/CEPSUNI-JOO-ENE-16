package pe.egcc.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class MateService {

  public long getPotencia(int base, int exponente){
    long potencia = 1;
    for (int i = 1; i <= exponente; i++) {
      potencia *= base;      
    }
    return potencia;
  }
  
}
