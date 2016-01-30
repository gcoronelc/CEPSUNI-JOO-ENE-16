package pe.egcc.modelo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   29/01/2016
 */
public class Clase2 extends Clase1{

  public Clase2() {
    super("Gustavo");
  }
  

  @Override
  public void mostrarMensaje() {
    super.mostrarMensaje(); // De la clase padre
    System.out.println("Hora de un break.");
  }
  
  

}
