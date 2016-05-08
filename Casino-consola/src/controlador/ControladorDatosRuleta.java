package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import dominio.Jugador;
import vista.IVistaDatosRuleta;


public class ControladorDatosRuleta implements Observer{

    private Fachada modelo = Fachada.getInstancia();
    private IVistaDatosRuleta vista;
    private Jugador usuario;
    
    
    @Override
    public void update(Observable o, Object arg) {
        
    }
    
    
    
}
