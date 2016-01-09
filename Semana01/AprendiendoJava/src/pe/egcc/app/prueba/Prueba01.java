package pe.egcc.app.prueba;

import javax.swing.JOptionPane;
import pe.egcc.app.service.MateService;


/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   08/01/2016
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    MateService mateService;
    mateService = new MateService();
    int suma = mateService.sumar(5, 6);
    System.out.println("Suma: " + suma);
    JOptionPane.showMessageDialog(null, "Suma: " + suma);
  }

}

