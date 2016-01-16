package pe.egcc.cepsuni.pagoapp.prueba;

import pe.egcc.cepsuni.pagoapp.dto.PagoDto;
import pe.egcc.cepsuni.pagoapp.service.PagoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    PagoDto pagoDto = new PagoDto();
    pagoDto.setHorasDia(6);
    pagoDto.setDias(20);
    pagoDto.setPagoHora(80.0);
    // Proceso
    PagoService pagoService = new PagoService();
    pagoService.procesar(pagoDto);
    // Reporte
    System.out.println("Ingresos: " + pagoDto.getIngresos());
    System.out.println("Renta: " + pagoDto.getRenta());
    System.out.println("Neto: " + pagoDto.getNeto());
  }
  
}
