package pe.egcc.app.prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Prueba08 {

  public static void main(String[] args) {
    // Generico
    Map datos = new HashMap();
    
    datos.put(10, "Mouse");
    datos.put("hola", "Karla");
    datos.put(345.67, new Random());
    
    for(Object key: datos.keySet()){
      Object value = datos.get(key);
      System.out.println(key + " | " + value);
    }
    
    datos.put(10, "Raton");
    System.out.println("-------------------");
    for(Object key: datos.keySet()){
      Object value = datos.get(key);
      System.out.println(key + " | " + value);
    }
    
  }
}
