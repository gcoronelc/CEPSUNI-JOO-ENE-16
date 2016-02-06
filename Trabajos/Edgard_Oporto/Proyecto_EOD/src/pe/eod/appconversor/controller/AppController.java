package pe.eod.appconversor.controller;

import pe.eod.appconversor.modelo.AppModelo;

public class AppController {

    public double convertirS2D(double soles){
        
        AppModelo model = new AppModelo();
        
        return model.SaD(soles);
    }
    
    public double convertirD2S(double dolares){
       
        AppModelo model = new AppModelo();
        
        return model.DaS(dolares);
    }

    public void actualizarTasa(double tasa) {
        AppModelo model = new AppModelo();
        
        model.setCambioD2S(tasa);
        model.setCambioS2D(1/tasa);
        
    }
    
}
