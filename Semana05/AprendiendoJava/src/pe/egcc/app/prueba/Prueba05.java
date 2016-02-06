package pe.egcc.app.prueba;

import java.util.Arrays;

public class Prueba05 {

  public static void main(String[] args) {
    
    int datos[] = {78,96,78,32,15,95,47,65,85};
    
    Arrays.stream(datos).forEach
        (value -> System.out.println(value) );
  }
}
