package pe.egcc.cepsuni.pagoapp.service;

import pe.egcc.cepsuni.pagoapp.dto.PagoDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class PagoService {

  public void procesar(PagoDto pagoDto){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = pagoDto.getHorasDia() * pagoDto.getDias() * pagoDto.getPagoHora();
    if(ingresos > 1500.0){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Salida
    pagoDto.setIngresos(ingresos);
    pagoDto.setRenta(renta);
    pagoDto.setNeto(neto);
  }
  
  
}
