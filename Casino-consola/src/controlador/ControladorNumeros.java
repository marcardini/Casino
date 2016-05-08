package controlador;

import vista.IVistaNumeros;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import dominio.Jugador;
import dominio.ruleta.CasilleroRuleta;

public class ControladorNumeros implements Observer{
    
    private Fachada modelo = Fachada.getInstancia();
    private IVistaNumeros vista;
    private Jugador usuario;

    public ControladorNumeros(IVistaNumeros vista,Jugador u) {
        this.vista = vista;
        vista.mostrar(modelo.getNumeros());
        modelo.addObserver(this); //registro
        usuario = u;
    }

    @Override
    public void update(Observable o, Object arg) {
       if(arg.equals(Fachada.EVENTO_NUMEROS)){
            vista.mostrar(modelo.getNumeros());
       }
    }

    public void marcar(CasilleroRuleta c) {
        c.setJugadorAposto(usuario);
    }
    
}
