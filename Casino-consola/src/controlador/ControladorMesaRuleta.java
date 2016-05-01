package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import vista.IVistaListaMesas;


public class ControladorMesaRuleta implements Observer{

    private Fachada modelo = Fachada.getInstancia();
    private IVistaListaMesas vista;

    public ControladorMesaRuleta(IVistaListaMesas v) {
        modelo.addObserver(this);
        vista = v;
        vista.mostrar(modelo.getListaMesaRuleta());
    }
    
    
    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Fachada.EVENTO_MESA_NUEVA)){
            vista.mostrar(null);
        }
        
    }
    
    
    
}
