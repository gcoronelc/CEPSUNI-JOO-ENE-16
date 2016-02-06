package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prueba06 {

  public static void main(String[] args) {
    // Lista generica
    List lista = new ArrayList();
    
    lista.add(1234);
    lista.add(3456.78);
    lista.add("Alianza Campeon");
    lista.add(new Random());
    lista.add(0673);
    
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
    
    lista.add(0,"Todos somos Java");
    System.out.println("-----------");
    for (Object obj : lista) {
      System.out.println(obj);
    }
    
    lista.remove(2);
    System.out.println("------------");
    lista.stream().forEach(value -> System.out.println(value) );
    
  }
  
}
