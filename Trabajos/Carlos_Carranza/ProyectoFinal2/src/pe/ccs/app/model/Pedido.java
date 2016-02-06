/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.ccs.app.model;

/**
 *
 * @author c.carranza.solis
 */
public class Pedido extends Libro{
    private String nombre;
    private String direccion;
    private String email;
    private String tipo_de_tarjeta;
    private String num_de_tarjeta;

    public Pedido() {
        
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_de_tarjeta() {
        return tipo_de_tarjeta;
    }

    public void setTipo_de_tarjeta(String tipo_de_tarjeta) {
        this.tipo_de_tarjeta = tipo_de_tarjeta;
    }

    public String getNum_de_tarjeta() {
        return num_de_tarjeta;
    }

    public void setNum_de_tarjeta(String num_de_tarjeta) {
        this.num_de_tarjeta = num_de_tarjeta;
    }
    
    
    
    
}
