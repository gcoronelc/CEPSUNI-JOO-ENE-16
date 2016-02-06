package pe.egcc.app.prueba;

import java.util.HashMap;
import java.util.Map;

public class Prueba09 {

  public static void main(String[] args) {
    Map<String,Object> datos = new HashMap<>();
    
    datos.put("Key1", "Gustavo");
    datos.put("Key2", "Karla");
    datos.put("Key3", "Ana");
    datos.put("Key4", "Pedro");
    datos.put("Key5", "Claudia");
    
    for(String key: datos.keySet()){
      Object value = datos.get(key);
      System.out.println(key + " | " + value);
    }
    
  }
}
