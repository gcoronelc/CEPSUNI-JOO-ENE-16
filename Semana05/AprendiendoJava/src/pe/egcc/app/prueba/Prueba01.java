package pe.egcc.app.prueba;

import pe.egcc.app.espec.IDemo1;
import pe.egcc.app.espec.IDemo2;
import pe.egcc.app.espec.IDemo3;
import pe.egcc.app.model.Clase1;

public class Prueba01 {

  public static void main(String[] args) {
    
    Clase1 va = new Clase1();
    IDemo3 vb = va;
    IDemo2 vc = va;
    IDemo1 vd = va;
    
    
  }
}
