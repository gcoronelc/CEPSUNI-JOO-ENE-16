package pe.egcc.prueba;

import pe.egcc.model.PersonalModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    PersonalModel model = new PersonalModel();
    
    mostrarObjeto(model);
    
    model.setNombre("GUSTAVO CORONEL");
    model.setCasado(true);
    
    mostrarObjeto(model);
    
  }

  private static void mostrarObjeto(PersonalModel model) {
    System.out.println("----------------------------------");
    System.out.println("Nombre: " + model.getNombre());
    System.out.println("DNI: " + model.getDni());
    System.out.println("Teléfono: " + model.getTelefono());
    System.out.println("Es Casado: " + model.isCasado());
  }
  
  
}
