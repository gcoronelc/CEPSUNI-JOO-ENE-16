/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.ccs.app.service;


import pe.ccs.app.model.Libro;
import pe.ccs.app.model.Pedido;

/**
 *
 * @author c.carranza.solis
 */
public class Metodos {
  

   public void procesar(Libro libro){
    // Variables
    double total, precio , ejemplares;
    // Proceso
    total = libro.getPrecio()*libro.getCantidad_libros();
   
    libro.setTotal(total);
   
  }
   
   public void pedir(Pedido pedido){
       
   }
}
