package pe.egcc.ventaapp.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public final class CompFactory {

  private CompFactory() {
  }

  public final static String COMP_FACTURA = "FACTURA";
  public final static String COMP_BOLETA = "BOLETA";
  
  public static CompAbstract crearComp(String tipo){
    CompAbstract bean = null;
    switch(tipo){
      case COMP_FACTURA:
        bean = new FacturaService();
        break;
      case COMP_BOLETA:
        bean = new BoletaService();
        break;
    }
    return bean;
  }
  
  
}
