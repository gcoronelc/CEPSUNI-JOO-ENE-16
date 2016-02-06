package clases;

import service.Fechas;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 04-feb-2016
 */
public class Persona {

    private String nombres;
    private Fechas fechaNac;

    public Persona(String nombres, Fechas fechaNac) {
        this.nombres = nombres;
        this.fechaNac = fechaNac;
    }

    public Persona() {
        this.nombres = "No definido";
        this.fechaNac = new Fechas(); // se asume 01/01/1900
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Fechas getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fechas fechaNac) {
        this.fechaNac = fechaNac;
    }

    //mostrar estado
    public  String getEstado(){
        return nombres + ", Fecha Nac:" + fechaNac.getFecha();
    }
}//fin clase
