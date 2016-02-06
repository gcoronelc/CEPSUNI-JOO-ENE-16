package pe.egcc.app.model;

import pe.egcc.app.espec.IMate;

public class MateImpl3 implements IMate{

  @Override
  public int sumar(int n1, int n2) {
    int value;
    value = (n1 + n2) / (n1 - n2);
    return value;
  }
  
}
