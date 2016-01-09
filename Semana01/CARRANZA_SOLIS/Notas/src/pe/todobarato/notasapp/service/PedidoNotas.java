/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.todobarato.notasapp.service;

import java.util.Arrays;

/**
 *
 * @author Ceps
 */
public class PedidoNotas {

  public double calcularPromedio(double ... notas) {
    double menor = calcularMenor(notas);
    double promedio = (Arrays.stream(notas).sum() - menor) / 3;
    return promedio;

  }

  public double calcularMenor(double ... notas) {
    Arrays.sort(notas);
    double menor = notas[0];
    return menor;
  }

}
