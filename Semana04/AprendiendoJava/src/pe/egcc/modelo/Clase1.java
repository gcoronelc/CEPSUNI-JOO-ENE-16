package pe.egcc.modelo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 29/01/2016
 */
public class Clase1 {

  protected final String SALUDO = "Hola amigos de Java, los espero en Cliente-Servidor.";

  public Clase1() {
    System.out.println("Jejejeje, estoy en la Clase1.");
  }

  public Clase1(String nombre) {
    System.out.println("Hola " + nombre);
  }

  public void mostrarMensaje() {
    System.out.println("Hola a todos.");
  }

}
