package pe.egcc.prueba;

import pe.egcc.model.PersonalModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    PersonalModel model;
    model = new PersonalModel("Marcela", "55555555", "99999999999", false);
    //model = new PersonalModel();
    
    System.out.println(model.getNombre());
    System.out.println(model.getDni());
    System.out.println(model.getTelefono());
    System.out.println(model.isCasado());

  }
  
}
