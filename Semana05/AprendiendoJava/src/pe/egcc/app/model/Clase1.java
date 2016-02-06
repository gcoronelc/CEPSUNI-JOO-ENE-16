package pe.egcc.app.model;

import pe.egcc.app.espec.IDemo3;

public class Clase1 implements IDemo3{

  @Override
  public int multiplica(int n1, int n2) {
    int value;
    value = n1 * n2;
    return value;
  }

  @Override
  public int sumar(int n1, int n2) {
    int value;
    value = n1 + n2;
    return value;
  }

  @Override
  public int restar(int n1, int n2) {
    int value;
    value = n1 - n2;
    return value;
  }
  
}
