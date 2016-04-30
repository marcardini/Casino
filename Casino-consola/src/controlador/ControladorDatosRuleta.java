package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import dominio.Jugador;
import vista.VistaDatosRuleta;


public class ControladorDatosRuleta implements Observer{

    private Fachada modelo = Fachada.getInstancia();
    private VistaDatosRuleta vista;
    private Jugador usuario;
    
    
    @Override
    public void update(Observable o, Object arg) {
        
    }
    
    
    
}
