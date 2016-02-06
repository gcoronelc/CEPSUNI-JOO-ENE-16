package pe.egcc.app.prueba;

public class Prueba03 {

  public static void main(String[] args) {
    
    int[] datos = new int[10];
    mostrar(datos);
    
    datos[2] = 20;
    datos[4] = datos[2] * 2;
    mostrar(datos);
    
  }

  private static void mostrar(int[] datos) {
    String repo = "Arreglo: ";
    for (int i = 0; i < datos.length; i++) {
      repo += datos[i] + " ";
    }
    System.out.println(repo);
  }
  
}
