package pe.egcc.mateexpert.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 22/01/2016
 */
public final class MyMath {

  private MyMath() {
  }

  public static long factorial(int n) {
    // Punto de partida
    long fact = 1;
    // Proceso
    while (n > 1) {
      fact *= n--;
    }
    // Retorno
    return fact;
  }

  public static int mcd(int n1, int n2) {
    while (n1 != n2) {
      if (n1 > n2) {
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }
    return n1;
  }

  public static int mcm(int n1, int n2) {
    int rpta;
    rpta = n1 * n2 / mcd(n1, n2);
    return rpta;
  }

  public static String fibonacci(int n) {
    return "";
  }

  public static boolean isPrimo(int n) {
    return false;
  }
}
