package clases;

import service.Fechas;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 04-feb-2016
 */
public class Alumno extends Persona {
    private int nota1;
    private int nota2;

    public Alumno(String nombres, Fechas fechaNac, int nota1, int nota2) {
        super(nombres, fechaNac);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Alumno() {
        this.nota1 = 20;
        this.nota2 = 20;
    }

    
    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }
    public String getEstado(){
        return super.getEstado()+", Notas: "+nota1+" - "+nota2;
    }
    public double promedio(){
        return (nota1+nota2)/2;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
}//
