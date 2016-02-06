package service;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @siledem@hotmail.com
 * @date 04-feb-2016
 */
public class Fechas {
    private int dia;
    private int mes;
    private int anio;
    //public int diaN, mesN,anioN;
///creamos constructor

    public Fechas(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
     public Fechas() {
       Calendar fecha = new GregorianCalendar();
         this.anio = fecha.get(Calendar.YEAR);
         this.mes = fecha.get(Calendar.MONTH)+1;
         this.dia = fecha.get(Calendar.DAY_OF_MONTH);
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
       
    public String getFecha(){
        return dia+"/"+mes+"/"+anio;
    }
    
    public boolean validafecha(){
        boolean fechaOk=false;
        //validacion de anio
        boolean anioOk=false;
        anioOk=(anio>=1965 && anio <=2100);//maximo 50 anios
        fechaOk=anioOk;
        //validacion de mes
        boolean mesOk=false;
        mesOk=(mes>=1 && mes <=12);
        fechaOk=anioOk && mesOk;
        //validacion de dia
        boolean diaOk=false;
        switch(mes){ //
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                diaOk=(dia>=1 && dia <=31);
                break;
            case 4: case 6: case 9: case 11:
                 diaOk=(dia>=1 && dia <=30);
                break;
            case 2:
                if (anio % 4 == 0)  {//anio bisiesto 
                         diaOk=(dia>=1 && dia <=29);
                    } else {
                        diaOk=(dia>=1 && dia <=28);
                    }
                 fechaOk=anioOk && mesOk && diaOk;
                break;
                
        } //fin switch    
         return fechaOk; 
        }
    public String calcularFechas(Fechas f2) {
        
        int tanios = this.anio - f2.anio;//a 
        int tmeses = this.mes - f2.mes; //b 
        int tdias = this.dia - f2.dia; //c 
        if (tmeses < 0) {
            tanios = tanios - 1;
            tmeses = 12 + tmeses;
        }

        if (tdias < 0) {
            tmeses = tmeses - 1;
            switch (this.getMes()) {
                case 2:
                   if (f2.anio % 4 == 0)  {
                        tdias = 29 + tdias;
                    } else {
                        tdias = 28 + tdias;
                    }
                    break;
                case 4: case 6: case 9:  case 11:
                    tdias = 30 + tdias;
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    tdias = 31 + tdias;
                    break;
            }
        }
        return "" + tanios + " Anios\n" + tmeses + " Meses\n" + tdias + " Dias";
    }
} //fin clase
 