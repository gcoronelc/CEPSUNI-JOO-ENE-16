/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.ccs.app.prueba;

import pe.ccs.app.model.Libro;

/**
 *
 * @author c.carranza.solis
 */
public class Prueba01 {
    public static void main(String[] args) {
        Libro libro = new Libro();
    
    mostrarObjeto(libro);
    libro.setIsbn("19232839");
    libro.setTitulo("Las Gardenias");
    libro.setAutor("Antonio Machado");
    libro.setEditorial("Grijalbo");
    libro.setEdicion(1);
    libro.setAño(1989);
    libro.setPrecio(200);
    libro.setCantidad_libros(3);
  
    
    mostrarObjeto(libro);
    }
    
      private static void mostrarObjeto(Libro libro) {
    System.out.println("----------------------------------");
    System.out.println("ISBN: " + libro.getIsbn());
    System.out.println("Titulo: " + libro.getTitulo());
    System.out.println("Autor: " + libro.getAutor());
    System.out.println("Editorial: " + libro.getEditorial());
     System.out.println("Edicion: " + libro.getEdicion());
    System.out.println("Año: " + libro.getAño());
    System.out.println("Precio: " + libro.getPrecio());
    System.out.println("Cantidad de Libros: " + libro.getCantidad_libros());
  }
}
