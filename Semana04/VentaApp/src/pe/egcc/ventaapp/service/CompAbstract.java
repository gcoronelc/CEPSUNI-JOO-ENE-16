package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public abstract class CompAbstract {

  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  public abstract ItemDto[] procesar(double total);
  
}
