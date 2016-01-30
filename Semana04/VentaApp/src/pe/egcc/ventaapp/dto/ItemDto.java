package pe.egcc.ventaapp.dto;

/**
 * Esta clase representa un item del reporte
 * que se debe obtener despues de procesar el total.
 * 
 * Se aplica tanto para facturas y boletas.
 * 
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public class ItemDto {

  private String concepto;
  private double valor;

  public ItemDto() {
  }

  public ItemDto(String concepto, double valor) {
    this.concepto = concepto;
    this.valor = valor;
  }

  /**
   * @return the concepto
   */
  public String getConcepto() {
    return concepto;
  }

  /**
   * @param concepto the concepto to set
   */
  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  /**
   * @return the valor
   */
  public double getValor() {
    return valor;
  }

  /**
   * @param valor the valor to set
   */
  public void setValor(double valor) {
    this.valor = valor;
  }
  
  
  
  
}
