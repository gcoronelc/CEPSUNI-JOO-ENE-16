package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public class CompController {

  public String[] obtenerTipos() {
    String[] tipos = {CompFactory.COMP_FACTURA, CompFactory.COMP_BOLETA};
    return tipos;
  }

  public ItemDto[] procesar(String tipo, double total) {
    CompAbstract comp = CompFactory.crearComp(tipo);
    return comp.procesar(total);
  }

}
