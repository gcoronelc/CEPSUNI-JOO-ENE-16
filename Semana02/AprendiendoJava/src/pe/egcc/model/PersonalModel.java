package pe.egcc.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 15/01/2016
 */
public class PersonalModel {

  private String nombre;
  private String dni;
  private String telefono;
  private boolean casado;

  public PersonalModel() {
    // this.nombre = "Claudia";
    // this.dni = "70653478";
    // this.telefono = "995678345";
    // this.casado = false;
    this("Claudia", "70653478", "984576893", false);
  }

  public PersonalModel(String nombre, String dni, String telefono, boolean casado) {
    this.nombre = nombre;
    this.dni = dni;
    this.telefono = telefono;
    this.casado = casado;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }

}
