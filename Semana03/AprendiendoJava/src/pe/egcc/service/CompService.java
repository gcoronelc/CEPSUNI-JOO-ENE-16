package pe.egcc.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 22/01/2016
 */
public final class CompService {

  private static final double IGV;

  static {
    IGV = 0.18;
  }

  private CompService() {
  }

  public static double calcImpuesto(double importe) {
    return importe * IGV;
  }

}
