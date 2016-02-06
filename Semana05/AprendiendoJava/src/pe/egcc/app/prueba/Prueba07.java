package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

public class Prueba07 {
  
  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    
    lista.add("Chiclayo");
    lista.add("Trujillo");
    lista.add("Cuzco");
    lista.add("Arequipa");
    lista.add("Huancayo");
    
    for (String value : lista) {
      System.out.println(value);
    }
    
  }
  
}
